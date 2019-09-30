package mbmwat.bookmakers.repository.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "games")
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "goals_home_team")
    private Long goalsHomeTeam;
    @Column(name = "goals_away_team")
    private Long goalsAwayTeam;
    private Timestamp timestamp;
    private String winner;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "game")
    private List<Bet> bets;
    @ManyToOne
    @JoinColumn(name = "league_id")
    private League league;
    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;
    @ManyToOne
    @JoinColumn(name = "team1_id")
    private Team homeTeam;
    @ManyToOne
    @JoinColumn(name = "team2_id")
    private Team awayTeam;

}