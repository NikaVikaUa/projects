package tomate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import tomate.domain.Order;
import tomate.domain.Pizza;
import tomate.domain.PizzaOrder;

import java.util.List;

public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Integer> {
    PizzaOrder findByPizza(Pizza pizza);
    List<PizzaOrder> findByOrder(Order order);
    PizzaOrder findByPizzaAndOrder(Pizza pizza, Order order);

    @Modifying //TODO?????
    int deleteByOrder(Order order);
}
