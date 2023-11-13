package tomate.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tomate.domain.User;


@Getter
@AllArgsConstructor
public class UserDTO {
    private Integer id;
    private String login;
    public static UserDTO getInstance(User user) {
        return new UserDTO(user.getId(), user.getLogin());
    }
}
