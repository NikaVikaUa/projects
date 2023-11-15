package tomate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomate.repository.OrderRepository;

@Service
public class AdminOrderService {
    @Autowired
    private OrderRepository orderRepository;
}
