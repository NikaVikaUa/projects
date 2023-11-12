package tomate.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity(name = "orders")
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_state", nullable = false)
    private OrderState orderState;
    private Double service;
    private Double total;
    private OffsetDateTime createDate;

    public Order(User user, OrderState orderState, Double service, Double total) {
        this.user = user;
        this.orderState = orderState;
        this.service = service;
        this.total = total;
        this.createDate = OffsetDateTime.now();

    }
}
