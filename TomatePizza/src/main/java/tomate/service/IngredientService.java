package tomate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomate.repository.IngredientRepository;
import tomate.repository.PizzaIngredientRepository;
import tomate.repository.PizzaSizeRepository;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private PizzaIngredientRepository pizzaIngredientRepository;

    @Autowired
    private PizzaSizeRepository pizzaSizeRepository;
}
