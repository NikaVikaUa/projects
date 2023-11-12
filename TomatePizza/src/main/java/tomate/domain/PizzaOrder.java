package tomate.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity(name = "pizza_orders")
@Data
@NoArgsConstructor
public class PizzaOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_order_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;
    private OffsetDateTime createDate;

    public PizzaOrder(Order order, Pizza pizza) {
        this.order = order;
        this.pizza = pizza;
        this.createDate = OffsetDateTime.now();
    }
}
