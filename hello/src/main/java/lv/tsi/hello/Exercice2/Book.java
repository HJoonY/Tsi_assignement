package lv.tsi.hello.Exercice2;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Book")

public class Book {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    Long id;

    @JsonProperty
    String author;

    @JsonProperty
    String name;

    @JsonProperty
    int copies;


}
