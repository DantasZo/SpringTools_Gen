package br.com.generation.Exercicio12072022;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int x[]= new int [5];
		int m=0;
		for(int i=0;i<5;i++) {
			System.out.print("Insira um valor: ");
			x[i]=leia.nextInt();
			if(m<x[i]) {
				m=x[i];}
		}System.out.println("O maior valor: "+m);
	}

}
