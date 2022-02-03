package br.com.aeviles.aula56;

public class TesteDocumento {

	public static void main(String[] args) {

		/*
		 * for (TipoDocumento doc : TipoDocumento.values()) { System.out.println(doc+
		 * " -" +doc.gerarNumeroTeste()); }
		 */

		Pessoa pf = new Pessoa();

		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumeroDocuemnto(pf.getTipoDocumento().gerarNumeroTeste());

		System.out.println(pf);

		Pessoa pj = new Pessoa();

		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumeroDocuemnto(pj.getTipoDocumento().gerarNumeroTeste());

		System.out.println(pj);

	}

}
