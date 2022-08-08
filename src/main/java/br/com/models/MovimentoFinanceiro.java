package br.com.models;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.utils.DateConverter;

public class MovimentoFinanceiro {
	
		
	protected GregorianCalendar dataDoMovimento;
	protected double valorDoMovimento;
	private long codigoDoCliente;
	private TIPO_MOVIMENTO tipoMovimento;
	private long codigoDoMovimento;
	
	
	public MovimentoFinanceiro(){}
	
	
	public GregorianCalendar getDataDoMovimento() {
		return dataDoMovimento;
	}
	
	public String getDataDoMovimentoFmt() {
		return DateConverter.DatetoString(dataDoMovimento);
	}	
	
	
	
	public void setDataDoMovimento(GregorianCalendar dataDoMovimento) {
		this.dataDoMovimento = dataDoMovimento;
	}
	public double getValorDoMovimento() {
		return valorDoMovimento;
	}
	public void setValorDoMovimento(double valorDoMovimento) {
		this.valorDoMovimento = valorDoMovimento;
	}

	protected long getCodigoDoCliente() {
		return codigoDoCliente;
	}
	protected void setCodigoDoCliente(long codigoDoCliente) {
		this.codigoDoCliente = codigoDoCliente;
	}
	public TIPO_MOVIMENTO getTipoMovimento() {
		return tipoMovimento;
	}
	public void setTipoMovimento(TIPO_MOVIMENTO tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}
	
	
	
}
