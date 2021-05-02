package hr.android.webapi.r6siege.map.repository;

import hr.android.webapi.r6siege.map.model.Map;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MapJpaRepository extends JpaRepository<Map, Long> {

    List<Map> findAll();
    Optional<Map> findByCode(String Code);

}
