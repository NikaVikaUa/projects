package tomate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomate.repository.PizzaBaseRepository;
import tomate.repository.PizzaTypeRepository;

@Service
public class PizzaTypeService {
    @Autowired
    private PizzaTypeRepository pizzaTypeRepository;

    @Autowired
    private PizzaBaseRepository pizzaBaseRepository;
}
