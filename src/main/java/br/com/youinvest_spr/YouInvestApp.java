package br.com.youinvest_spr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



//Obs: Essa classe de inicialização precisa estar no mesmo pacote do @SpringBootApplication
@Component
public class YouInvestApp implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Classe de Inicialização!");
		
	}

	
	
}
