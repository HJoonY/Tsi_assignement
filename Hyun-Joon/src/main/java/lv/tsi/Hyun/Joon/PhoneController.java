package lv.tsi.Hyun.Joon;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Phone>> getAllPhone() {
        return phoneService.getPhones();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity getPhoneById(@PathVariable Integer id) {
        return phoneService.getPhoneById(id);
    }

    @GetMapping("/totalPrice")
    public String  sumPrice() {
        String text = "Total price is "+ phoneService.sumPhone();
        return text;
    }

    @DeleteMapping("/phone/{id}")
    public ResponseEntity deletePhoneById(@PathVariable Integer id) {
        phoneService.deletePhone(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @PostMapping("/phone")
    public ResponseEntity<Phone> addPhone(@RequestBody Phone phone) {
        var savePhone = phoneService.addPhone(phone);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savePhone);

    }
}
