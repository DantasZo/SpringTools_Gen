package br.com.generation.Aula12072022;

public class Vetores {
	public static void main(String[] args) {
		//array --arranjo
		//Vetor,Matriz, List etc...Array
		
		
		int[] vetor= new int [10]; // vai de 0 a 9
		int numero= 145;
		
		
		vetor[2]= 357;
		vetor[4]= numero;
		vetor[7]= 456;
		int valor = vetor[7];
		
		
		for(int i=0;i <=9;i++) {
			
		
			
			System.out.println("Posição do vetor:"+i+" "+vetor[i]);
			System.out.println("Valor do vetor"+valor);
			
		}
		
	}

}
