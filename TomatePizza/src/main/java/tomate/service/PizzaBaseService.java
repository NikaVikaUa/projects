package tomate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomate.repository.PizzaBaseRepository;
import tomate.repository.PizzaSizeRepository;
import tomate.repository.PizzaTypeRepository;

@Service
public class PizzaBaseService {
    @Autowired
    private PizzaBaseRepository pizzaBaseRepository;

    @Autowired
    private PizzaTypeRepository pizzaTypeRepository;

    @Autowired
    private PizzaSizeRepository pizzaSizeRepository;
}
