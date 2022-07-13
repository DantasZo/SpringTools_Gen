package br.com.generation.aula13072022;

public class TestaAluno {

	public static void main(String[] args) {
		
		//Estanciar o objeto --> criar o objeto
		Aluno al1 = new Aluno();
				
		al1.setNome("Ingrid");
		al1.setIdade(22);
		al1.setCurso("Java - Puro");
		
		System.out.println(al1.getNome());
		System.out.println(al1.getIdade());
		System.out.println(al1.getCurso());
		

	}

}
