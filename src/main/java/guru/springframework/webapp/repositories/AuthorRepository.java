package guru.springframework.webapp.repositories;

import guru.springframework.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Jaison.Chipuka
 */

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
