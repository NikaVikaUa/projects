package tomate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tomate.domain.Ingredient;
import tomate.domain.PizzaSize;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    int countByPizzaSize(PizzaSize pizzaSize);
}
