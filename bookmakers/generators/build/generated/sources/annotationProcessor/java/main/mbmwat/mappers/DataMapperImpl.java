package mbmwat.mappers;

import javax.annotation.Generated;
import mbmwat.bookmakers.repository.model.Game;
import mbmwat.bookmakers.repository.model.Game.GameBuilder;
import mbmwat.bookmakers.repository.model.League;
import mbmwat.bookmakers.repository.model.League.LeagueBuilder;
import mbmwat.bookmakers.repository.model.Team;
import mbmwat.bookmakers.repository.model.Team.TeamBuilder;
import mbmwat.bookmakers.repository.model.Venue;
import mbmwat.bookmakers.repository.model.Venue.VenueBuilder;
import mbmwat.model.api.AwayTeam;
import mbmwat.model.api.Competition;
import mbmwat.model.api.FullTime;
import mbmwat.model.api.HomeTeam;
import mbmwat.model.api.Match;
import mbmwat.model.api.Score;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-06T18:50:30+0200",
    comments = "version: 1.3.0.Beta1, compiler: javac, environment: Java 12.0.2 (Oracle Corporation)"
)
public class DataMapperImpl implements DataMapper {

    @Override
    public Team homeTeamToTeam(HomeTeam homeTeam) {
        if ( homeTeam == null ) {
            return null;
        }

        TeamBuilder team = Team.builder();

        team.name( homeTeam.getName() );
        team.id( (long) homeTeam.getId() );

        return team.build();
    }

    @Override
    public Team awayTeamToTeam(AwayTeam awayTeam) {
        if ( awayTeam == null ) {
            return null;
        }

        TeamBuilder team = Team.builder();

        team.name( awayTeam.getName() );
        team.id( (long) awayTeam.getId() );

        return team.build();
    }

    @Override
    public Game matchToGame(Match match) {
        if ( match == null ) {
            return null;
        }

        GameBuilder game = Game.builder();

        game.league( competitionToLeague( match.getCompetition() ) );
        game.venue( matchToVenue( match ) );
        Integer homeTeam = matchScoreFullTimeHomeTeam( match );
        if ( homeTeam != null ) {
            game.goalsHomeTeam( homeTeam.longValue() );
        }
        Integer awayTeam = matchScoreFullTimeAwayTeam( match );
        if ( awayTeam != null ) {
            game.goalsAwayTeam( awayTeam.longValue() );
        }
        game.id( (long) match.getId() );
        game.homeTeam( homeTeamToTeam( match.getHomeTeam() ) );
        game.awayTeam( awayTeamToTeam( match.getAwayTeam() ) );

        return game.build();
    }

    protected League competitionToLeague(Competition competition) {
        if ( competition == null ) {
            return null;
        }

        LeagueBuilder league = League.builder();

        league.name( competition.getName() );
        league.id( (long) competition.getId() );

        return league.build();
    }

    protected Venue matchToVenue(Match match) {
        if ( match == null ) {
            return null;
        }

        VenueBuilder venue = Venue.builder();

        venue.name( match.getStage() );

        return venue.build();
    }

    private Integer matchScoreFullTimeHomeTeam(Match match) {
        if ( match == null ) {
            return null;
        }
        Score score = match.getScore();
        if ( score == null ) {
            return null;
        }
        FullTime fullTime = score.getFullTime();
        if ( fullTime == null ) {
            return null;
        }
        int homeTeam = fullTime.getHomeTeam();
        return homeTeam;
    }

    private Integer matchScoreFullTimeAwayTeam(Match match) {
        if ( match == null ) {
            return null;
        }
        Score score = match.getScore();
        if ( score == null ) {
            return null;
        }
        FullTime fullTime = score.getFullTime();
        if ( fullTime == null ) {
            return null;
        }
        int awayTeam = fullTime.getAwayTeam();
        return awayTeam;
    }
}
