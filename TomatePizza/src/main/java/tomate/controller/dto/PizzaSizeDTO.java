package tomate.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tomate.domain.PizzaSize;

@AllArgsConstructor
@Getter
public class PizzaSizeDTO {
    private Integer id;
    private String name;
    private String size;

    public static PizzaSizeDTO getInstance(PizzaSize pizzaSize) {
        return new PizzaSizeDTO(pizzaSize.getId(), pizzaSize.getName(), pizzaSize.getSize());
    }
}
