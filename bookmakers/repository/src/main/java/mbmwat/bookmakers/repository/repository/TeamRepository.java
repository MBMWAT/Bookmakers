package mbmwat.bookmakers.repository.repository;

import mbmwat.bookmakers.repository.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
}
