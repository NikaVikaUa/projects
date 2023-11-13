package tomate.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tomate.domain.Ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class IngredientDTO {
    private Integer id;
    private String name;
    private Integer pizzaSizeId;
    private String pizzaSize;
    private String description;
    private Double price;

    public static IngredientDTO getInstance(Ingredient ingredient) {
        return new IngredientDTO(ingredient.getId(), ingredient.getName(),
                ingredient.getPizzaSize().getId(),ingredient.getPizzaSize().getSize(),
                ingredient.getDescription(), ingredient.getPrice());
    }

    public static List<IngredientDTO> getInctance(List<Ingredient> ingredients) {
        if(ingredients == null){
            return new ArrayList<>();
        }
        return ingredients.stream().map(IngredientDTO::getInstance).collect(Collectors.toList());
    }
}
