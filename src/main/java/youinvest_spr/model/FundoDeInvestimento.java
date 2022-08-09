package youinvest_spr.model;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;

import org.hibernate.FetchMode;
import org.springframework.transaction.annotation.Transactional;



@Entity(name = "Tb_Fundos")
@Transactional
@NamedEntityGraph(name = "FundoDeInvestimento.detail",
attributeNodes = @NamedAttributeNode("listaDeCotas"))

public class FundoDeInvestimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigoDoFundo;
	private String nomeDoFundo;
	private String nomeDoGestor;
	private String perfilDoInvestidor;
	private String descricao;
	
	
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "codigo_fundo")
	private List<CotaDeFundo> listaDeCotas;

	
	public FundoDeInvestimento(String nomeDoFundo, String nomeDoGestor, long codigoDoFundo) {
		super();
		this.nomeDoFundo = nomeDoFundo;
		this.nomeDoGestor = nomeDoGestor;
		this.codigoDoFundo = codigoDoFundo;
	}

	public FundoDeInvestimento() {
		super();
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
