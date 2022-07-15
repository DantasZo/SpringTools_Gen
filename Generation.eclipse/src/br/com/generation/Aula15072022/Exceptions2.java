package br.com.generation.Aula15072022;

import java.util.Scanner;

public class Exceptions2 {
	
	public static void main(String[] args) {
		
		try {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		int numero1 = leia.nextInt();
		
		System.out.println("Numero 2: ");
		int numero2 = leia.nextInt();
		
		int divisao = numero1 / numero2;
		
		System.out.println("Resultado: "+divisao);
		leia.close();
	}
		catch(java.lang.ArithmeticException e) {
			System.out.println("Impossivel dividir por zero ...");
		
		}
		finally {
			System.out.println("Cabo então, vai ficar de gracinha!");
		}
	}
}
