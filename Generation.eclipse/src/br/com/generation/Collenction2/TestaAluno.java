package br.com.generation.Collenction2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<aula> Alunos = new ArrayList<>();
		
		System.out.println("Quando alunos você quer adicionar? ");
		int numeroDeAlunos = s.nextInt();
		
		for(int i = 0; i < numeroDeAlunos; i++) {
			System.out.println("Digite a idade do Aluno: ");
			int idade =	s.nextInt();
			
			s.nextLine();
			
			System.out.println("Nome do aluno: ");
			String nome = s.nextLine();
		
			Alunos.add(new aula(nome,idade));	
		}
		for(aula i : Alunos) {
		System.out.println(i);
		
		}
		
	}

}
