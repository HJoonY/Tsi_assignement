package lv.tsi.hello.exercice3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


//@Repository
@Component
public interface HandphoneRepository extends JpaRepository<Handphone,Long> {

}
