package br.com.generation.Aula12072022;

import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		
		Scanner leia=  new Scanner(System.in);
		double[][] notasAlunos = new double[2][2];
	
		for(int i = 0; i<notasAlunos.length; i++) { //linhas
			for(int c = 0; c< notasAlunos[1].length;c++) { //colunas
			
				System.out.println("Insira as notas: ");
				notasAlunos[i][c]=leia.nextDouble();
	        }}
		for(int i = 0; i<notasAlunos.length; i++) { //linhas
			for(int c = 0; c< notasAlunos[1].length;c++) {//colunas
				System.out.print(notasAlunos[i][c] + "  |  ");
			}System.out.println();

			
			leia.close();
		}	
	}
}
