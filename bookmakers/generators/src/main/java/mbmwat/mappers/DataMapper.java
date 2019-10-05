package mbmwat.mappers;

import mbmwat.bookmakers.repository.model.Game;
import mbmwat.bookmakers.repository.model.Team;
import mbmwat.model.api.AwayTeam;
import mbmwat.model.api.HomeTeam;
import mbmwat.model.api.Match;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface DataMapper {

    @Mappings({
            @Mapping(target = "name", source = "name")
    })
    Team homeTeamToTeam(HomeTeam homeTeam);

    @Mappings({
            @Mapping(target = "name", source = "name")
    })
    Team awayTeamToTeam(AwayTeam awayTeam);

    @Mappings({
            @Mapping(target = "goalsHomeTeam", source = "score.fullTime.homeTeam"),
            @Mapping(target = "goalsAwayTeam", source = "score.fullTime.awayTeam"),
            @Mapping(target = "venue.name", source = "stage"),
            @Mapping(target = "league.name", source = "competition.name")
    })
    Game matchToGame(Match match);

}
