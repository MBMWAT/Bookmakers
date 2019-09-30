package mbmwat.bookmakers.repository.repository;

import mbmwat.bookmakers.repository.model.League;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends CrudRepository<League, Long> {
}
