package br.com.models;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import br.com.utils.DateConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CotaDeFundo {
	
	private GregorianCalendar dataDaCota;
	private double valorDaCota;
	private long codigoDoFundo;
	
	
	public CotaDeFundo() {
		
	}
	
	public CotaDeFundo(GregorianCalendar dataDaCota, double valorDaCota, long codigoDoFundo) {
		super();
		this.dataDaCota = dataDaCota;
		this.valorDaCota = valorDaCota;
		this.codigoDoFundo = codigoDoFundo;
	}
	
	public GregorianCalendar getDataDaCota() {
		return dataDaCota;
	}
	
	public String getDataDaCotaFormatada() {
		return DateConverter.DatetoString(dataDaCota);
	}
		
	public void setDataDaCota(GregorianCalendar dataDaCota) {
		this.dataDaCota = dataDaCota;
	}
	
	
	
	public void setDataDaCota(String dataDaCota) {
		
		this.dataDaCota = DateConverter.StringtoDate(dataDaCota);
	}
	
	public double getValorDaCota() {
		return valorDaCota;
	}
	public void setValorDaCota(double valorDaCota) {
		this.valorDaCota = valorDaCota;
	}
	public long getCodigoDoFundo() {
		return codigoDoFundo;
	}
	public void setCodigoDoFundo(long codigoDoFundo) {
		this.codigoDoFundo = codigoDoFundo;
	}

	@Override
	public String toString() {
		
		try {
		
		return "CotaDeFundo [dataDaCota=" + DateConverter.DatetoString(dataDaCota) + ""
				+ ", valorDaCota=" + valorDaCota + ", codigoDoFundo="
				+ codigoDoFundo + "]";
		
		}catch (Exception e){
			//e.printStackTrace();
			
			return "A data da cota está vazia, verifique!";
		}
				
	}
	
	public CotaDeFundo(String dataDaCota, double valorDaCota, long codigoDoFundo) {
		super();

		this.dataDaCota = DateConverter.StringtoDate(dataDaCota);

		this.valorDaCota = valorDaCota;
		this.codigoDoFundo = codigoDoFundo;
	}
	
	

}


