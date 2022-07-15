package br.com.generation.Software;

import java.util.Scanner;

public class Testametodounitario {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado = 4;
		
		System.out.println("Digite os valores:  ");
		int resultado = calc.somar(leia.nextInt(), leia.nextInt());
		
		if(resultado==resultadoEsperado) {
			System.out.println("Tudo certo !");
		}
		else {
			System.out.println("Fail.");
		}
		
	}

}
