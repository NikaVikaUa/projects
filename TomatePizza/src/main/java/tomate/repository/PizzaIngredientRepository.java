package tomate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tomate.domain.Ingredient;
import tomate.domain.Pizza;
import tomate.domain.PizzaIngredient;

import java.util.List;

@Repository
public interface PizzaIngredientRepository extends JpaRepository<PizzaIngredient, Integer> {

    //TODO I added @Query
    @Query("SELECT COUNT(i) FROM pizza_ingredients i WHERE i.ingredient = :ingredient")
    int countByIngredient(@Param("ingredient")Ingredient ingredient);

    PizzaIngredient findByPizzaAndIngredient(Pizza pizza, Ingredient ingredient);

    //TODO ??????
    @Modifying
    int deleteByPizzaIn(List<Pizza> pizzaList);
}
