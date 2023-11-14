package tomate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tomate.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin(String login);
}
