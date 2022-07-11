package br.com.br.generation.Aula11072022;

import java.util.Scanner;

public class laçowhile3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		while (numero != 10) {
		
		System.out.println("Digite um numero: ");
        numero=leia.nextInt();
        
        if(numero==10) {
        	System.out.println("Acertou em cheio!");
        	           }
        	else {
        		System.out.println("Errou!");
        	     }
                             }
		         }
        
	}


