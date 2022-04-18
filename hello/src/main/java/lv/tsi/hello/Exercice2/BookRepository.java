package lv.tsi.hello.Exercice2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



//@Repository
@Component
public interface BookRepository extends JpaRepository<Book,Long> {

}
