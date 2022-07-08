package br.com.generation.exercicios08072022;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double  idade;
		
		System.out.println("Digite a sua idade: ");
		idade= entrada.nextDouble();
		
		
		    if(idade < 14) {
		    System.out.println("Sua faixa etária corresponde a: Infantil ");

		}   else if(idade>= 15 && idade<17) {
			System.out.println("Sua faixa etária corresponde a: Juvenil ");
		}
		
		    else if(idade >= 17 ) {
			System.out.println("Sua faixa etária corresponde a: Adulto ");
		    }
	}

}
