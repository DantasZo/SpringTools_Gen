package br.com.generation.Aula15072022;

public class Exceptions {

	
	public static void main(String[] args) {
		
		int[] vetor = new int[4];
		
		System.out.println("Antes da Exceptions! !");
		
		try {
		
		vetor[4]=10;
		System.out.println("Após exception");
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Código ta quebrado, toda via vai ter que rodar assim mesmo :D ");
		}
		System.out.println(vetor[4]);
	}
}
