package youinvest_spr;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import youinvest_spr.model.CotaDeFundo;
import youinvest_spr.model.FundoDeInvestimento;
import youinvest_spr.repository.CotasRepository;
import youinvest_spr.repository.FundosRepository;



//Obs: Essa classe de inicialização precisa estar no mesmo pacote do @SpringBootApplication
@Component
public class YouInvestApp implements CommandLineRunner {

	@Autowired 
    private FundosRepository fundosrepository;
	
	@Autowired
    private CotasRepository cotasrepository;
	
	
	private FundoDeInvestimento fundodeInvestimento;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Classe de Inicialização!");
		//CriaFundo();
		//CriaCotas();
		VerCota();
		
	}

	private void CriaFundo() {
		
		//Criação do Fundo de Investimento
		FundoDeInvestimento fundodeInvestimento = 
				new FundoDeInvestimento("INFRAESTRUTURA INFLAÇÃO CRÉDITO PRIVADO2",
						"Santander Asset Management", 1000L);
		
		fundosrepository.save(fundodeInvestimento);
		
	}
	
	private void CriaCotas() {
		
		//Criação das Cotas
		
				fundodeInvestimento = fundosrepository.getReferenceById(9L);
		
				CotaDeFundo cotadefundo;
				
				List<CotaDeFundo> CotasList = new ArrayList<CotaDeFundo>();
				
				for(int i=0; i <= 6; i++)		
					CotasList.add(new CotaDeFundo());
				
					int cCota = 0;
				
					CotasList.get(cCota).setDataDaCota("01/07/2022");
					CotasList.get(cCota).setValorDaCota(1.07271978);
					CotasList.get(cCota).setFundodeinvestimento(fundodeInvestimento);
					
					cCota++;
					CotasList.get(cCota).setDataDaCota("04/07/2022");
					CotasList.get(cCota).setValorDaCota(1.0702506);
					CotasList.get(cCota).setFundodeinvestimento(fundodeInvestimento);	

					cCota++;
					CotasList.get(cCota).setDataDaCota("05/07/2022");
					CotasList.get(cCota).setValorDaCota(1.06834541);
					CotasList.get(cCota).setFundodeinvestimento(fundodeInvestimento);	
					
					cCota++;
					CotasList.get(cCota).setDataDaCota("06/07/2022");
					CotasList.get(cCota).setValorDaCota(1.06606754);
					CotasList.get(cCota).setFundodeinvestimento(fundodeInvestimento);	
					
					cCota++;
					CotasList.get(cCota).setDataDaCota("07/07/2022");
					CotasList.get(cCota).setValorDaCota(1.06654311);
					CotasList.get(cCota).setFundodeinvestimento(fundodeInvestimento);	
					
					cCota++;
					CotasList.get(cCota).setDataDaCota("08/07/2022");
					CotasList.get(cCota).setValorDaCota(1.06150462);
					CotasList.get(cCota).setFundodeinvestimento(fundodeInvestimento);	
					
					cCota++;
					CotasList.get(cCota).setDataDaCota("11/07/2022");
					CotasList.get(cCota).setValorDaCota(1.05830657);
					CotasList.get(cCota).setFundodeinvestimento(fundodeInvestimento);	
			
			
					CotasList.forEach(cota ->
						{
						cotasrepository.save(cota);
						});
	
			
	}
	
		private void VerCota() {
			
			//FundoDeInvestimento fundo = fundosrepository.getReferenceById(1L);
			
			System.out.println(fundosrepository.findById(9L).get().getListaDeCotas());
			
			//System.out.println(fundo.getListaDeCotas());
		
			System.out.println(cotasrepository.findById(4L).get());
			
			//FundoDeInvestimento fundo = fundosrepository.findBycodigoDoFundo(1L);
			
			//System.out.println(fundo.getListaDeCotas());
		}
	
	
}
