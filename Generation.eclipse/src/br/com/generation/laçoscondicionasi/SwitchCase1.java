package br.com.generation.laçoscondicionasi;

import java.util.Scanner;

public class SwitchCase1 {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Insira 1* numero: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite a operação: ");
		char operacao = entrada.next().charAt(0);
		
		System.out.println("Insira o 2* numero: ");
		int numero2 = entrada.nextInt();
		
		int resultado;
		
		switch(operacao) {
		case'+':
			resultado = numero1 + numero2;
			System.out.println("Resultado: "+resultado);
			break;
		case '-':
			resultado =  numero1 - numero2;
			System.out.println("Resultado: "+ resultado);
		    	break;		case '*':
					resultado =  numero1 * numero2;
					System.out.println("Resultado: "+ resultado);
				    	break;		case '/':
							resultado =  numero1 / numero2;
							System.out.println("Resultado: "+ resultado);
						    	break;
		    	default:
		    		System.out.println("Invalido!");
		    		break;
			
		}
         
		
	}

}
