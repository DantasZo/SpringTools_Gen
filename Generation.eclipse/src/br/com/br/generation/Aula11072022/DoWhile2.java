package br.com.br.generation.Aula11072022;

import java.util.Scanner;

public class DoWhile2 {
	public static void main(String[] args) {
		double a, soma = 0.0;
		Scanner leia = new Scanner(System.in);
		
		do {
			 System.out.println("Digite um numero para a soma ou zero para sair: ");
			 a = leia.nextDouble();
			 soma += a;
			 
		}while(a !=0.0);
		System.out.println("A soma dos numeros é: " + soma);
	}

}
