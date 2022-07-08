package br.com.generation.exercicios08072022;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		int z,y, x;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Primeiro valor: ");
		x = leia.nextInt();
		
		System.out.println("Primeiro valor: ");
		z = leia.nextInt();
		
		System.out.println("Primeiro valor: ");
		y = leia.nextInt();
		
        
        int a = Math.max(Math.max(x, y), z);
        
      System.out.println(a);
	}

}
