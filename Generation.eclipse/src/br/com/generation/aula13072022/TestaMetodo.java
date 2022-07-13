package br.com.generation.aula13072022;

import java.util.Scanner;

public class TestaMetodo {
	
	//Declara��o de variaveis globais....
	static int numero3, numero4, subtracao;

	//Funcao inicio
	public static void main(String[] args) { // --> M�todo..Principal
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os valores: ");
		int numero7 = entrada.nextInt();
		int numero8 = entrada.nextInt();		
		
		metodo01();
		metodo02();
		metodo03();
		metodo04();
		metodo05(2,8); // --> argumentos
		System.out.println(MetodoFora.metodo06(numero7, numero8)); //--> argumentos de i e de f
	}
	
	// ---> verbo.. a��o
	public static void metodo01() {
		System.out.println("ol� eu sou o m�todo 01...");
	}
	
	public static void metodo02() {
		int soma, numero1 = 10, numero2 = 20; //Variaveis locais, funcionanm dentro do metodo
		
		soma = numero1 + numero2;
		
		System.out.println("Soma no m�todo 02: " + soma);
	}
	
	public static void metodo03() {
		subtracao = numero3 - numero4;
		
	}
	
	public static void metodo04() {
		System.out.println("M�todo 04 - mostrando resultado do m�todo 03: " + subtracao);
	}
	
	public static void metodo05(int numero5, int numero6) {//--> parametros(receber)
		int multiplicacao = numero5 * numero6;
		System.out.println("Multiplica��o no m�todo05: " + multiplicacao);
	}

}
