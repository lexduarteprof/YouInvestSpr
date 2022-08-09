package youinvest_spr.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.transaction.annotation.Transactional;

import youinvest_spr.utils.DateConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Transactional
@Entity(name = "Tb_Cotas")
public class CotaDeFundo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigoCota;
	private GregorianCalendar dataDaCota;
	private double valorDaCota;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "codigo_do_fundo")
	private FundoDeInvestimento fundodeinvestimento;
	
	public CotaDeFundo() {
		
	}
	
	public CotaDeFundo(GregorianCalendar dataDaCota, double valorDaCota,
			FundoDeInvestimento fundodeinvestimento) {
		super();
		this.dataDaCota = dataDaCota;
		this.valorDaCota = valorDaCota;
		this.fundodeinvestimento = fundodeinvestimento;
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
		System.out.println("verif" + dataDaCota);
	}
	
	public double getValorDaCota() {
		return valorDaCota;
	}
	public void setValorDaCota(double valorDaCota) {
		this.valorDaCota = valorDaCota;
	}

	
	
	public long getCodigoCota() {
		return codigoCota;
	}

	public void setCodigoCota(long codigoCota) {
		this.codigoCota = codigoCota;
	}

	public FundoDeInvestimento getFundodeinvestimento() {
		return fundodeinvestimento;
	}

	public void setFundodeinvestimento(FundoDeInvestimento fundodeinvestimento) {
		this.fundodeinvestimento = fundodeinvestimento;
	}

	@Override
	public String toString() {
		
		try {
		
		return "CotaDeFundo [dataDaCota=" + DateConverter.DatetoString(dataDaCota) + ""
				+ ", valorDaCota=" + valorDaCota + ", codigoDoFundo="
				+ fundodeinvestimento + "]";
		
		}catch (Exception e){
			//e.printStackTrace();
			
			return "A data da cota está vazia, verifique!";
		}
				
	}
	
	public CotaDeFundo(String dataDaCota, double valorDaCota, FundoDeInvestimento fundodeinvestimento) {
		super();

		this.dataDaCota = DateConverter.StringtoDate(dataDaCota);

		this.valorDaCota = valorDaCota;
		this.fundodeinvestimento = fundodeinvestimento;
	}
	
	

}


