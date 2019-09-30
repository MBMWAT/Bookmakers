package mbmwat.bookmakers.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bets")
public class Bet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "predicted_result_home_team")
    private int predictedResultHomeTeam;
    @Column(name = "predicted_result_away_team")
    private int predictedResultAwayTeam;
    @Column(name = "bet_value")
    private BigDecimal betValue;
    @Column(name = "predicted_winner")
    private String predictedWinner;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
}