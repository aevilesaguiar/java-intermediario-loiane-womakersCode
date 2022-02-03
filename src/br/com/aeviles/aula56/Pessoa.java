package br.com.aeviles.aula56;

public class Pessoa {
	
	private TipoDocumento tipoDocumento;
	private String numeroDocuemnto;/*gerar um numero randomico*/
	
	
	public Pessoa(TipoDocumento tipoDocumento, String numeroDocuemnto) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocuemnto = numeroDocuemnto;
	}
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String getNumeroDocuemnto() {
		return numeroDocuemnto;
	}
	
	public void setNumeroDocuemnto(String numeroDocuemnto) {
		this.numeroDocuemnto = numeroDocuemnto;
	}

	@Override
	public String toString() {
		return "Pessoa [tipoDocumento=" + tipoDocumento + ", numeroDocuemnto=" + numeroDocuemnto + "]";
	}
	
	

}
