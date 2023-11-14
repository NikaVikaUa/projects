package tomate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import tomate.domain.Pizza;

import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
    @Modifying
    int deleteByIdIn(List<Integer> pizzaIds);
}
