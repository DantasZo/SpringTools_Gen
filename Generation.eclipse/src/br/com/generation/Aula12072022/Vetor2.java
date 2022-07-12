package br.com.generation.Aula12072022;

import java.util.Scanner;

public class Vetor2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double[] notas= new double[3];
		String[] nome= new String[3];
        double soma = 0.0, media = 0.0;
        
        for(int i=0; i<=2; i++) {
        	System.out.print("digite o nome do aluno: ");	
        	nome[i]=leia.next();
        	System.out.print("digite as notas do aluno: ");
        	notas[i]=leia.nextDouble();
                                }
        //length
        for(int i=0; i<=2; i++) {
        	System.out.println("Aluno "+ nome[i] +" Nota: "+notas[i]);
        }
        
        
	}
}
