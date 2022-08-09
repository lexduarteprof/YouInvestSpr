package youinvest_spr.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import youinvest_spr.model.FundoDeInvestimento;

public interface FundosRepository extends JpaRepository<FundoDeInvestimento, Long> {

	//@EntityGraph(value = "FundoDeInvestimento.detail", type = EntityGraphType.LOAD)
	//public FundoDeInvestimento findBycodigoDoFundo(long codigo);

}
