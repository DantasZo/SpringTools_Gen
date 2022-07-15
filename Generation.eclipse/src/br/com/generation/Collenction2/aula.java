package br.com.generation.Collenction2;

public class aula {
	
	private int idade;
	private String nome;
	
	
	
	public aula(String nome, int idade) {
		super();
		this.idade= idade;
		this.nome= nome;
		
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String toString() {
		return "aula [idade=" + idade + ", nome=" + nome + "]";
	}
	
	

}
