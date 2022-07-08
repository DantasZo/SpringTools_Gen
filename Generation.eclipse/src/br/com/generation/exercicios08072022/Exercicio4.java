package br.com.generation.exercicios08072022;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int num, i;
		
		System.out.println("Informe um numero: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
		System.out.println("O numero informado é par!");
		System.out.println("E sua raiz quadrada correponde a: "+Math.sqrt(num));
		                 }
	    else {System.out.println("É impar!");
	    System.out.println("E quando elevamos seu numero ao quadrado o resultado é: "+num*num);
		
		
		}
	}
}
