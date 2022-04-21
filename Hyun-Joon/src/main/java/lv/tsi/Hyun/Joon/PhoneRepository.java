package lv.tsi.Hyun.Joon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PhoneRepository extends JpaRepository<Phone, Integer> {


}
