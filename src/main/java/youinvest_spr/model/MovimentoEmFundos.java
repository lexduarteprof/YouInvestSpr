package youinvest_spr.model;

import java.util.Calendar;

public class MovimentoEmFundos extends MovimentoFinanceiro {
	
	private FundoDeInvestimento fundodeInvestimento;
	private double QtCotasMovimento;
	
	
	public MovimentoEmFundos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FundoDeInvestimento getFundodeInvestimento() {
		return fundodeInvestimento;
	}

	public void setFundodeInvestimento(FundoDeInvestimento fundodeInvestimento) {
		this.fundodeInvestimento = fundodeInvestimento;
	}

	public double getQtCotasMovimento() {
		return QtCotasMovimento;
	}
	
	@Override
	public void setValorDoMovimento(double valorDoMovimento) {
		// TODO Auto-generated method stub
		super.setValorDoMovimento(valorDoMovimento);
		
		double cotaDoMovimento =
				this.fundodeInvestimento.buscarCotaPorData(this.dataDoMovimento).getValorDaCota();
		
		this.QtCotasMovimento = valorDoMovimento / cotaDoMovimento;
		
		
	}

	
}
