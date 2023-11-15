package tomate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tomate.controller.dto.OrderDTO;
import tomate.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class UserOrderController {
    @Autowired
    private UserService userService;

}
