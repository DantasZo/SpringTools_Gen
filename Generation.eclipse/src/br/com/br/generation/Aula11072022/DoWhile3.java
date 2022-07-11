package br.com.br.generation.Aula11072022;

import java.util.Scanner;

public class DoWhile3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i = 0;
		
		do {
			System.out.println("Digite o primeiro numero: ");
			int numero1 = leia.nextInt();
			System.out.println("Digite o segundo numero: ");
			int numero2 = leia.nextInt();
			i++;
			System.out.println(i+" posição "+numero1+"/"+ numero2+" é: "+ (numero1/numero2));
			if(numero1==0) {
				System.out.println("\n");
				System.out.println("Divisão por zero é  sempre zero!!");
				//break;--> quebra o while
				System.out.println("\n");
				i--;
				continue; //continua mesmo que não de.
			}
		}while(i<=4);
		System.out.println("Encerramos por aqui !");

			
		}
	}


