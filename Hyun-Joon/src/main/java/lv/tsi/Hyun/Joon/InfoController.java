package lv.tsi.Hyun.Joon;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor

public class InfoController {
    LocalDate localDate = LocalDate.now();

    String info = "Hyun Joon YOO – author of the application\n"+"Task variant 1 \n"+localDate;

    @GetMapping("/info")
    public String hello() {
        return info;
    }
}
