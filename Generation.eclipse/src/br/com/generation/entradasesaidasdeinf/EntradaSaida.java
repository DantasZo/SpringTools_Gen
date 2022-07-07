package br.com.generation.entradasesaidasdeinf;

import java.util.Scanner;

public class EntradaSaida {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in); // entrada de dados do usuário
	int a, b, soma;

	System.out .println("Escreva o valor de A: ");
    a = leia.nextInt();

	System.out.println("Escreva o valor de B: ");
    b = leia.nextInt();

	soma = a+b;

	System.out.println("O resultado da soma é: " + soma);

	leia.close();

}

}
