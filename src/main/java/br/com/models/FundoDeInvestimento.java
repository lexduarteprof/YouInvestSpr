package br.com.models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

public class FundoDeInvestimento {
	
	private String nomeDoFundo;
	private String nomeDoGestor;
	private long codigoDoFundo;
	private String perfilDoInvestidor;
	private String descricao;
	private List<CotaDeFundo> listaDeCotas = new ArrayList<CotaDeFundo>();
		
	
	public FundoDeInvestimento(String nomeDoFundo, String nomeDoGestor, long codigoDoFundo) {
		super();
		this.nomeDoFundo = nomeDoFundo;
		this.nomeDoGestor = nomeDoGestor;
		this.codigoDoFundo = codigoDoFundo;
	}

	@Override
	public String toString() {
		return "FundoDeInvestimento [nomeDoFundo=" + nomeDoFundo + ", nomeDoGestor=" + nomeDoGestor + ", codigoDoFundo="
				+ codigoDoFundo + "]";
	}
	
	public String getNomeDoFundo() {
		return nomeDoFundo;
	}
	public void setNomeDoFundo(String nomeDoFundo) {
		this.nomeDoFundo = nomeDoFundo;
	}
	public String getNomeDoGestor() {
		return nomeDoGestor;
	}
	public void setNomeDoGestor(String nomeDoGestor) {
		this.nomeDoGestor = nomeDoGestor;
	}
	public long getCodigoDoFundo() {
		return codigoDoFundo;
	}
	public void setCodigoDoFundo(long codigoDoFundo) {
		this.codigoDoFundo = codigoDoFundo;
	}
	public String getPerfilDoInvestidor() {
		return perfilDoInvestidor;
	}
	public void setPerfilDoInvestidor(String perfilDoInvestidor) {
		this.perfilDoInvestidor = perfilDoInvestidor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<CotaDeFundo> getListaDeCotas() {
		return listaDeCotas;
	}
	public void setListaDeCotas(List<CotaDeFundo> listaDeCotas) {
		this.listaDeCotas = listaDeCotas;
	}
	
	public void registraCota(CotaDeFundo cotadefundo) {
		
		this.listaDeCotas.add(cotadefundo);
		
	}
	
	public CotaDeFundo buscarCotaPorData(GregorianCalendar data) {
			
	
		for (CotaDeFundo cotaDeFundo : listaDeCotas) {
			
			if(cotaDeFundo.getDataDaCota().compareTo(data) == 0) {

				return cotaDeFundo;
			}
			
		}
		
		return null;
				
	}

	

}
