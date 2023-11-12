package tomate.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity(name = "pizza_ingredients")
@Data
@NoArgsConstructor
public class PizzaIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_ingredient_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;
    private OffsetDateTime createDate;

    public PizzaIngredient(Pizza pizza, Ingredient ingredient) {
        this.pizza = pizza;
        this.ingredient = ingredient;
        this.createDate = OffsetDateTime.now();
    }
}
