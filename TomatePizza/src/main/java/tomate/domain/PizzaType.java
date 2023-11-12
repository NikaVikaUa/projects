package tomate.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity(name = "pizza_types")
@Data
@NoArgsConstructor
public class PizzaType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_type_id")
    private Integer id;
    private String name;
    private String description;
    private String pathImage;
    private OffsetDateTime createDate;

    public PizzaType(String name, String description, String pathImage) {
        this.name = name;
        this.description = description;
        this.pathImage = pathImage;
        this.createDate = OffsetDateTime.now();
    }
}
