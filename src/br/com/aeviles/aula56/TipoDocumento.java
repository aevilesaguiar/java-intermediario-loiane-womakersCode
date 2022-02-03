package br.com.aeviles.aula56;

public enum TipoDocumento {

	CPF {
		@Override
		public String gerarNumeroTeste() {
			
			return GerarCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String gerarNumeroTeste() {
			 
			return GerarCpfCnpj.cnpj();
		}
	};
	
	public abstract String gerarNumeroTeste();
	
	
}
