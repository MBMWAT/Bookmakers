package mbmwat.bookmakers.repository.repository;

import mbmwat.bookmakers.repository.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
}
