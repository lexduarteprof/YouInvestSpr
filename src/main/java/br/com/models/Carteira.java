package br.com.models;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.utils.DateConverter;

public class Carteira {
	
	private long codigoCliente;
	private List<MovimentoEmFundos> movimentoEmFundos = new ArrayList<MovimentoEmFundos>();
	private Double SaldoCotasDaCarteira;
	private FundoDeInvestimento fundoDaCarteira;
	private GregorianCalendar dataPosicaoCarteira;
	
	
	public GregorianCalendar getDataPosicaoCarteira() {
		return dataPosicaoCarteira;
	}
	public void setDataPosicaoCarteira(GregorianCalendar dataPosicaoCarteira) {
		this.dataPosicaoCarteira = dataPosicaoCarteira;
	}
	public FundoDeInvestimento getFundoDaCarteira() {
		return fundoDaCarteira;
	}
	public void setFundoDaCarteira(FundoDeInvestimento fundoDaCarteira) {
		this.fundoDaCarteira = fundoDaCarteira;
	}
	
	public long getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public List<MovimentoEmFundos> getMovimentoEmFundos() {
		return movimentoEmFundos;
	}
	public void setMovimentoEmFundos(List<MovimentoEmFundos> movimentoEmFundos) {
		this.movimentoEmFundos = movimentoEmFundos;
	}
	public Double getSaldoCotasDaCarteira() {
		return SaldoCotasDaCarteira;
	}
	public void setSaldoCotasDaCarteira(Double saldoCotasDaCarteira) {
		SaldoCotasDaCarteira = saldoCotasDaCarteira;
	}
	
	public void RegistrarMovimento(MovimentoEmFundos movimentoEmFundos) {
		
		this.movimentoEmFundos.add(movimentoEmFundos);
		
	}
	
	public void ExtratoCarteira() {
		
		System.out.println("Extrato do Período");
		System.out.println("Movimento   |  Valor   |   Valor em Cotas");
		
		double SaldoAtualizado = 0;
		
		for (MovimentoEmFundos Movimento : movimentoEmFundos) {
			
			System.out.println(Movimento.getDataDoMovimentoFmt() + " | " + Movimento.getTipoMovimento() + " | " + Movimento.getValorDoMovimento() + " | " + Movimento.getQtCotasMovimento());
			
			if(Movimento.getTipoMovimento() == TIPO_MOVIMENTO.APLICACAO) {
			
			SaldoAtualizado += Movimento.getQtCotasMovimento();
			}else {
			SaldoAtualizado -= Movimento.getQtCotasMovimento();
			}
			
			}

		CotaDeFundo cotadefundo = this.fundoDaCarteira.buscarCotaPorData(this.dataPosicaoCarteira);
		
		double SaldoAtualizadoReais = SaldoAtualizado * cotadefundo.getValorDaCota();
		
		System.out.println("\nSaldo em Cotas: " + SaldoAtualizado);
		System.out.println("Valor da cota em: " + DateConverter.DatetoString(this.dataPosicaoCarteira) + ": " + cotadefundo.getValorDaCota());
		System.out.println("Saldo em Reais: " + SaldoAtualizadoReais);
		
	}
	
}
