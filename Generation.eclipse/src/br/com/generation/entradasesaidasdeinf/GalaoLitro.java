package br.com.generation.entradasesaidasdeinf;

import java.util.Scanner;

public class GalaoLitro {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);

	double galoes, litros;

	System.out.println("Insira o número de galões: ");

	galoes = leia.nextDouble();

	litros = galoes * 3.600;

	System.out.println(galoes + " galões são " + litros + " litros.");
	leia.close();

}

}
