package mbmwat.bookmakers.repository.model;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teams")
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private String logoUrl;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "homeTeam",  cascade = CascadeType.REMOVE)
    private List<Game> matchesAsHomeTeam;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "awayTeam",  cascade = CascadeType.REMOVE)
    private List<Game> matchesAsAwayTeam;
}