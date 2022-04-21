package lv.tsi.Hyun.Joon;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Phone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @JsonProperty
    String brand;

    @JsonProperty
    String model;

    @JsonProperty
    Double price;

}
