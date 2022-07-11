package br.com.generation.exercicios11072022;

import java.util.Scanner;

public class Exercicio05 {
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
