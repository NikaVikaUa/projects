package tomate.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomate.repository.OrderRepository;

@Slf4j //TODO?????
@Service
public class UserOrderService {
    @Autowired
    private OrderRepository orderRepository;
}
