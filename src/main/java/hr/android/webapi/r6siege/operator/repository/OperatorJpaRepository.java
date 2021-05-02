package hr.android.webapi.r6siege.operator.repository;

import hr.android.webapi.r6siege.operator.model.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OperatorJpaRepository extends JpaRepository<Operator, Long> {

    List<Operator> findAll();
    List<Operator> findByType(String Type);
    Optional<Operator> findByCode(String Code);

}
