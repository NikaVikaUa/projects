package tomate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tomate.domain.PizzaBase;
import tomate.domain.PizzaSize;
import tomate.domain.PizzaType;

import java.util.List;

@Repository
public interface PizzaBaseRepository extends JpaRepository {
    @Query("SELECT p FROM pizza_bases p WHERE LOWER(p.pizzaType.name) LIKE :find OR LOWER(p.pizzaType.description) LIKE :find")
    List<PizzaBase> findByNameOrDescription(@Param("find") String findString);

    @Query("SELECT COUNT(p) FROM pizza_bases p WHERE p.pizzaSize = :pizzaSize")
    int countByPizzaSize(@Param("pizzaSize")PizzaSize pizzaSize);

    //TODO I added @Query
    @Query("SELECT COUNT(p) FROM pizza_bases p WHERE p.pizzaType = :pizzaType")
    int countByPizzaType(@Param("pizzaType")PizzaType pizzaType);
}
