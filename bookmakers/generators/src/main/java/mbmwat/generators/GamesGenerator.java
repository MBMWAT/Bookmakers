package mbmwat.generators;

import com.google.gson.Gson;
import mbmwat.bookmakers.repository.model.Game;
import mbmwat.http.HttpFootballMatchesService;
import mbmwat.http.HttpService;
import mbmwat.mappers.DataMapper;
import mbmwat.model.api.MatchesData;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class GamesGenerator {

    public List<Game> generateGames(){

        MatchesData matchesData = getRecentMatchesDate();
        DataMapper dataMapper = Mappers.getMapper(DataMapper.class);

        return matchesData
                .getMatches()
                .stream()
                .map(dataMapper::matchToGame)
                .collect(Collectors.toList());
    }

    private MatchesData getRecentMatchesDate(){

        HttpService httpService = new HttpFootballMatchesService();

        String jsonBody = httpService
                .get("https://api.football-data.org/v2/matches?dateFrom=" + LocalDate.now().minusDays(3) + "&dateTo=" + LocalDate.now())
                .orElseThrow(() -> new IllegalArgumentException("GamesGenerator - generateGames() - no data found. "))
                .body()
                .toString();

        Gson gson = new Gson();

        return gson.fromJson(jsonBody, MatchesData.class);
    }
}
