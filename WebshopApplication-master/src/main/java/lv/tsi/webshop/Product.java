package lv.tsi.webshop;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product")

public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    long id;

    @JsonProperty
    String name;

    @JsonProperty
    String description;

    @JsonProperty
    float price;

    @JsonProperty
    String pictureUrl;

    @JsonProperty
//    ProductCategory productCategory;
    String productCategory;
}
