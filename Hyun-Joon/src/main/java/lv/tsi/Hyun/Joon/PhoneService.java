package lv.tsi.Hyun.Joon;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class PhoneService {
    private final PhoneRepository phoneRepository;

    /**
     * Get list of all Phones from database using {@link PhoneRepository}
     *
     * @return list of Phones
     */
    public ResponseEntity<List<Phone>> getPhones() {
        return ResponseEntity.ok(phoneRepository.findAll());
    }

    /**
     * Get phone by id using {@link PhoneRepository}
     *
     * @param id Phone ID
     * @return Brand
     */
    public ResponseEntity<Object> getPhoneById(Integer id) {
        var phone = phoneRepository.findById(id);
        return phone.<ResponseEntity<Object>>map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(
                        ErrorResponse.builder()
                                .errorCode("Phone_NOT_FOUND")
                                .errorMessage("Phone does not exist with id:" + id)
                                .referenceId(UUID.randomUUID().toString())
                                .build()

                ));


    }
    /**
     * Save phone using {@link PhoneRepository}
     * @param phone Phone data
     * @return saved phone
     */
    public Phone addPhone(Phone phone) {
        return phoneRepository.save(phone);
    }


    /**
     * Delete phone by id
     * @param id phone id
     * @return deleted phone id
     */
    public Integer deletePhone(Integer id) {
        phoneRepository.deleteById(id);
        return id;
    }
    /**
     * Calcul all of price
     * @return total price
     */
    public Double sumPhone(){
        Double totalprice = 0.0;
        List<Double> prices = new ArrayList<>();
        var dataset = getPhones().getBody();
        dataset.stream().forEach(element -> prices.add(element.price) );

        for (double num : prices   ) { totalprice += num; }
        return totalprice;
    }
}
