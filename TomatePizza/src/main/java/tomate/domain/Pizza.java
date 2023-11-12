package tomate.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity(name = "pizzas")
@Data
@NoArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "pizza_base_id")
    private PizzaBase pizzaBase;
    private Double priceBase;
    private Double total;
    private OffsetDateTime createDate;

    public Pizza(PizzaBase pizzaBase, Double priceBase, Double total) {
        this.pizzaBase = pizzaBase;
        this.priceBase = priceBase;
        this.total = total;
        this.createDate = OffsetDateTime.now();
    }
}
