package guru.springframework.webapp.repositories;

import guru.springframework.webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Jaison.Chipuka
 */

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
