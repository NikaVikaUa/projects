package tomate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tomate.domain.PizzaType;

@Repository
public interface PizzaTypeRepository extends JpaRepository<PizzaType, Integer> {
}
