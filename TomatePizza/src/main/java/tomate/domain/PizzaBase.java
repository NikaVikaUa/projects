package tomate.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity(name = "pizza_bases")
@Data
@NoArgsConstructor
public class PizzaBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_base_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "pizza_type_id")
    private PizzaType pizzaType;

    @ManyToOne
    @JoinColumn(name = "pizza_size_id")
    private PizzaSize pizzaSize;
    private Double price;
    private Boolean ordered;
    private Boolean deleted;
    private OffsetDateTime createDate;

    public PizzaBase(PizzaType pizzaType, PizzaSize pizzaSize, Double price, Boolean ordered, Boolean deleted) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.price = price;
        this.ordered = ordered;
        this.deleted = deleted;
        this.createDate = OffsetDateTime.now();
    }
}
