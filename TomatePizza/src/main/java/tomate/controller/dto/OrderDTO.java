package tomate.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tomate.domain.Ingredient;
import tomate.domain.Order;
import tomate.domain.Pizza;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@AllArgsConstructor
public class OrderDTO {
    private Integer id;
    private Integer userId;
    private String state;
    private OffsetDateTime createDate;
    private Double service;
    private Double total;
    private List<PizzaDTO> pizzas;

    public static OrderDTO getInstance(Order order) {
        return getInstance(order, new ArrayList<>(), new HashMap<>());
    }

    private static OrderDTO getInstance(Order order, List<Pizza> pizzas, HashMap<Pizza, List<Ingredient>> ingredientMap) {
        return new OrderDTO(order.getId(), order.getUser().getId(), order.getOrderState().name(),
                order.getCreateDate(),order.getService(), order.getTotal(), PizzaDTO.getInstance(pizzas, ingredientMap));
    }
}
