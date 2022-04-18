package lv.tsi.hello.exercice3;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Handphone")

public class Handphone {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    Long id;

    @JsonProperty
    String username;

    @JsonProperty
    String number;


}
