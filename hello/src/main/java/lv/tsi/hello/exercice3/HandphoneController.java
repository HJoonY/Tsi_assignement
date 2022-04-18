package lv.tsi.hello.exercice3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController


public class HandphoneController {
    @Autowired
    private HandphoneRepository handphoneRepository;


    @GetMapping("/getHandphones")
    public ResponseEntity<Iterable<Handphone>> getHandphones(){
        return ResponseEntity.ok(handphoneRepository.findAll());
    }

    @GetMapping("/getHandphone/{id}")
    public ResponseEntity gethandphone(@PathVariable Long id){
        return handphoneRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());

    }

}