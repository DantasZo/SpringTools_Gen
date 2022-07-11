package br.com.generation.exercicios11072022;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		int a=0, soma = 0,i=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			 System.out.println("Digite um numero para a soma ou zero para sair: ");
			 a = leia.nextInt();
			 if(a%3==0) {
			 soma=a+soma;
			 i++;
			            }
		}while(a !=0);
		i--;
		System.out.println("A média dos numeros multiplos de 3 é: " + soma/i);
		
	}
}
