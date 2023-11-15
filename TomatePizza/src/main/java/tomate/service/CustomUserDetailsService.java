package tomate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomate.repository.UserRepository;

@Service
public class CustomUserDetailsService {
    @Autowired
    private UserRepository userRepository;
}
