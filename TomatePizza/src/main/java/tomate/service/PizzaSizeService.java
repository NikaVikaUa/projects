package tomate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomate.repository.IngredientRepository;
import tomate.repository.PizzaBaseRepository;
import tomate.repository.PizzaSizeRepository;

@Service
public class PizzaSizeService {
    @Autowired
    private PizzaSizeRepository pizzaSizeRepository;

    @Autowired
    private PizzaBaseRepository pizzaBaseRepository;

    @Autowired
    private IngredientRepository ingredientRepository;
}
