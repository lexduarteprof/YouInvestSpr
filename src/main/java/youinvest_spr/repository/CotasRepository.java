package youinvest_spr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import youinvest_spr.model.CotaDeFundo;


public interface CotasRepository extends JpaRepository<CotaDeFundo, Long> {

}
