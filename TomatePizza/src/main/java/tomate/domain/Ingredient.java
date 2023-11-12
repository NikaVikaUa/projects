package tomate.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@Entity(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingredient_id")
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "pizza_size_id")
    private PizzaSize pizzaSize;
    private String description;
    private Double price;
    private OffsetDateTime createDate;

    public Ingredient(String name, PizzaSize pizzaSize, String description, Double price) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.description = description;
        this.price = price;
        this.createDate = OffsetDateTime.now();
    }
}
