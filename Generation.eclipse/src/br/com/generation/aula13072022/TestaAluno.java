package br.com.generation.aula13072022;

public class TestaAluno {
	
	//Caracterisiticas... variaveis... atributos de classe
	private int idade;
	private String nome;
	private String curso;	
	
	//getters e setters --> servi�os que me auxilia no acesso e na modifica��o dos daods
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//A��es... m�todos... fun��es
	void estudar() {
		System.out.println("Aluno estudando....");
	}
}
