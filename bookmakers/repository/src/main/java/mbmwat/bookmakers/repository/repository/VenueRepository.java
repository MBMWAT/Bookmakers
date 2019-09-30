package mbmwat.bookmakers.repository.repository;

import mbmwat.bookmakers.repository.model.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends CrudRepository<Venue, Long> {
}
