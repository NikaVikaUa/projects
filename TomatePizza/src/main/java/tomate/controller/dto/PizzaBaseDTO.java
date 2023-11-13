package tomate.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tomate.domain.PizzaBase;

@AllArgsConstructor
@Getter
public class PizzaBaseDTO {
    private Integer id;
    private String name;
    private String description;
    private String size;
    private Double price;
    private Boolean deleted;

    public static PizzaBaseDTO getInstance(PizzaBase pizzaBase) {
        return new PizzaBaseDTO(pizzaBase.getId(), pizzaBase.getPizzaType().getName(),
                pizzaBase.getPizzaType().getDescription(), pizzaBase.getPizzaSize().getSize(),
                pizzaBase.getPrice(), pizzaBase.getDeleted());
    }
}
