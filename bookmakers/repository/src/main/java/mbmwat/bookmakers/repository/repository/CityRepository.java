package mbmwat.bookmakers.repository.repository;

import mbmwat.bookmakers.repository.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
}
