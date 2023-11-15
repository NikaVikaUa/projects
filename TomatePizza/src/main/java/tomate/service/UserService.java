package tomate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomate.controller.dto.UserDTO;
import tomate.domain.User;
import tomate.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO add(UserDTO userDTO) {
        User user = new User();
        user.setLogin(userDTO.getLogin());
        return UserDTO.getInstance(user);
    }
}
