package lv.tsi.hello.exercice1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(
        @RequestParam(value = "name",defaultValue = "Spring") String name){
          return "{ \"content\": \"Hello, my name is "+ name+" }";
    }

}
