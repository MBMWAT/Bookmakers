package mbmwat.bookmakers.repository.repository;

import mbmwat.bookmakers.repository.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
