package br.com.aeviles.aula75_84;

public class Pessoa {
	
	private int cod;
	private String nome;
	private int idade;
	
	public Pessoa(int cod, String nome, int idade) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Pessoa [cod=" + cod + ", nome=" + nome + ", idade=" + idade + "]";
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	

}
