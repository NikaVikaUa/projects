package tomate.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity(name = "pizza_sizes")
@Data
@NoArgsConstructor
public class PizzaSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_size_id")
    private Integer id;
    private String name;
    private String size;
    private OffsetDateTime createDate;

    public PizzaSize(String name, String size) {
        this.name = name;
        this.size = size;
        this.createDate = OffsetDateTime.now();
    }
}
