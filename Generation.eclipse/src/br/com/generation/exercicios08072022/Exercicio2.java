package br.com.generation.exercicios08072022;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);

        long[] valor= new long[4]; 
        
        System.out.println("Lembre-se de inserir apenas numeros inteiros!");
        System.out.println("Digite um numero: ");
        valor[0]=leia.nextLong();
        System.out.println("Digite mais um número inteiro:");
        valor[1]=leia.nextLong();
        System.out.println("Digite outro número inteiro:");
        valor[2]=leia.nextLong();
        System.out.println("Digite o ultimo número inteiro:");
        valor[3]=leia.nextLong();

        leia.close(); 
        
        boolean flag; 

        do {
            flag = false; 

            for(int i=0; i < valor.length - 1; i++) {

              if (valor[i] > valor[i + 1]) {

                  long aux = valor[i]; 
                  valor[i] = valor[i + 1];
                  valor[i + 1] = aux;

                  flag = true;
              }
            }
        } while (flag); 

        System.out.println("Os números digitados na ordem crescente são: " + Arrays.toString(valor));
	}

}
