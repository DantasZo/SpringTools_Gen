package br.com.generation.exercicios11072022;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de
		   21 anos. Total de pessoas com mais de 50 anos. 
		   O programa termina quando idade for =-99.*/
		Scanner leia= new Scanner(System.in);
		int i=0;
		
		int pessoas21=0, pessoas50=0, pessoasentre=0, leridade;
		while(i<4) {
			i++;
			System.out.println("Diga sua idade: ");
			leridade= leia.nextInt();
			if(leridade>99) {
				System.out.println("Valor invalido.");
				break;}
			if(leridade>50 && leridade<=99){
				pessoas50++;
			}
			if(leridade<21){
				pessoas21++;
			}
			if(leridade>=21 && leridade<=50){
				pessoasentre++;
			}		
		}
		System.out.println("Então temos um total de: "+pessoas21+" "
				+ "pessoa(s) abaixo de 21");
		System.out.println(pessoasentre+" pessoa(s) entre 21 e 50");
		System.out.println("e "+pessoas50+" pessoa(s) com mais de 50");
	}
}
