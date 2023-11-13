package tomate.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tomate.domain.PizzaType;

@AllArgsConstructor
@Getter
public class PizzaTypeDTO {
    private Integer id;
    private String name;
    private String description;
    private String pathImage;

    public static PizzaTypeDTO getInstance(PizzaType pizzaType) {
        return new PizzaTypeDTO(pizzaType.getId(), pizzaType.getName(), pizzaType.getDescription(),
                pizzaType.getPathImage());
    }
}
