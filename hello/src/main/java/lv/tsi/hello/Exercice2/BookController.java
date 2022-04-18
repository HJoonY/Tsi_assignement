package lv.tsi.hello.Exercice2;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController


public class BookController {
    @Autowired
    private BookRepository bookRepository;


    @GetMapping("/getBooks")
    public ResponseEntity<Iterable<Book>> getBooks(){
        return ResponseEntity.ok(bookRepository.findAll());
    }

    @GetMapping("/getBook/{id}")
    public ResponseEntity getBook(@PathVariable Long id){
        return bookRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());

    }

}