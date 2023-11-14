package tomate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tomate.domain.PizzaSize;

@Repository
public interface PizzaSizeRepository extends JpaRepository<PizzaSize, Integer> {

}
