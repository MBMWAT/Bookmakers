package mbmwat.bookmakers.repository.repository;

import mbmwat.bookmakers.repository.model.Bet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRepository extends CrudRepository<Bet, Long> {
}