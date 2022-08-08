package br.com.testes;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.models.Carteira;
import br.com.models.CotaDeFundo;
import br.com.models.FundoDeInvestimento;
import br.com.models.MovimentoEmFundos;
import br.com.models.MovimentoFinanceiro;
import br.com.models.TIPO_MOVIMENTO;
import br.com.utils.DateConverter;

public class Teste {
	
	//Criação do Fundo de Investimento
	public static FundoDeInvestimento fundodeInvestimento = 
			new FundoDeInvestimento("INFRAESTRUTURA INFLAÇÃO CRÉDITO PRIVADO",
					"Santander Asset Management", 1000L);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carregaFundoeCotas();
		criaMovimentos();

	}
	
	private static void carregaFundoeCotas() {
		
	
		//Criação das Cotas
		
		CotaDeFundo cotadefundo;
		
		List<CotaDeFundo> CotasList = new ArrayList<CotaDeFundo>();
		
		for(int i=0; i <= 6; i++)		
			CotasList.add(new CotaDeFundo());
		
			int cCota = 0;
		
			CotasList.get(cCota).setDataDaCota("01/07/2022");
			CotasList.get(cCota).setValorDaCota(1.07271978);
			CotasList.get(cCota).setCodigoDoFundo(1000);
			
			cCota++;
			CotasList.get(cCota).setDataDaCota("04/07/2022");
			CotasList.get(cCota).setValorDaCota(1.0702506);
			CotasList.get(cCota).setCodigoDoFundo(1000);	

			cCota++;
			CotasList.get(cCota).setDataDaCota("05/07/2022");
			CotasList.get(cCota).setValorDaCota(1.06834541);
			CotasList.get(cCota).setCodigoDoFundo(1000);	
			
			cCota++;
			CotasList.get(cCota).setDataDaCota("06/07/2022");
			CotasList.get(cCota).setValorDaCota(1.06606754);
			CotasList.get(cCota).setCodigoDoFundo(1000);	
			
			cCota++;
			CotasList.get(cCota).setDataDaCota("07/07/2022");
			CotasList.get(cCota).setValorDaCota(1.06654311);
			CotasList.get(cCota).setCodigoDoFundo(1000);	
			
			cCota++;
			CotasList.get(cCota).setDataDaCota("08/07/2022");
			CotasList.get(cCota).setValorDaCota(1.06150462);
			CotasList.get(cCota).setCodigoDoFundo(1000);	
			
			cCota++;
			CotasList.get(cCota).setDataDaCota("11/07/2022");
			CotasList.get(cCota).setValorDaCota(1.05830657);
			CotasList.get(cCota).setCodigoDoFundo(1000);	
	
	
			CotasList.forEach(cota ->{
				fundodeInvestimento.registraCota(cota)
				;});
		
	
	}
	
	public static void criaMovimentos() {
		
		Carteira carteira = new Carteira();
		
		carteira.setDataPosicaoCarteira(DateConverter.StringtoDate("11/07/2022"));
		carteira.setFundoDaCarteira(fundodeInvestimento);
		
		MovimentoEmFundos movimentoEmFundos =
				new MovimentoEmFundos();
		movimentoEmFundos.setDataDoMovimento(DateConverter.StringtoDate("01/07/2022"));
		movimentoEmFundos.setFundodeInvestimento(fundodeInvestimento);
		movimentoEmFundos.setTipoMovimento(TIPO_MOVIMENTO.APLICACAO);
		movimentoEmFundos.setValorDoMovimento(10000);
		carteira.RegistrarMovimento(movimentoEmFundos);
		
		movimentoEmFundos =
				new MovimentoEmFundos();
		movimentoEmFundos.setDataDoMovimento(DateConverter.StringtoDate("04/07/2022"));
		movimentoEmFundos.setFundodeInvestimento(fundodeInvestimento);
		movimentoEmFundos.setTipoMovimento(TIPO_MOVIMENTO.APLICACAO);
		movimentoEmFundos.setValorDoMovimento(15000);
		carteira.RegistrarMovimento(movimentoEmFundos);
		
		movimentoEmFundos =
				new MovimentoEmFundos();
		movimentoEmFundos.setDataDoMovimento(DateConverter.StringtoDate("11/07/2022"));
		movimentoEmFundos.setFundodeInvestimento(fundodeInvestimento);
		movimentoEmFundos.setTipoMovimento(TIPO_MOVIMENTO.RESGATE);
		movimentoEmFundos.setValorDoMovimento(5000);
		carteira.RegistrarMovimento(movimentoEmFundos);
		
		System.out.println(carteira.getMovimentoEmFundos().get(2).getQtCotasMovimento());
		
		carteira.ExtratoCarteira();
		
		
		
	}
	

}
