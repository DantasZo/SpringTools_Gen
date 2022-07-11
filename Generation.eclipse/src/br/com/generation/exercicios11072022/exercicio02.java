package br.com.generation.exercicios11072022;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		
		Scanner leia = new Scanner(System.in);
		for (int i=1,num=0,par=0,impar=0;i<=10;i++) {
		System.out.println("Insira 1 valor: ");
		num=leia.nextInt();
		    if(num %2 ==0){
			   par++;
			   System.out.println(num+" Esse é um numero par :D");
		    }
            if(num %2 >=1){
            	impar++;
            	System.out.println(num+ " Esse é um numero impar :O");
                          }
		
		
		System.out.println(par+" <par|impar> "+impar);
		                    
	}
}
}
