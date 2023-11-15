package tomate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomate.repository.PizzaIngredientRepository;
import tomate.repository.PizzaOrderRepository;

@Service
public class PizzaService {
    @Autowired
    private PizzaOrderRepository pizzaOrderRepository;

    @Autowired
    private PizzaIngredientRepository pizzaIngredientRepository;
}
