package br.com.generation.exercicios11072022;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) throws InterruptedException {
/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, 
a cada uma das pessoas
era perguntado: idade, sexo 
(1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3,
se a pessoa era agressiva). Pede-se para elaborar 
um sistema que permita ler os dados de 150
pessoas, calcule e mostre:*/
	Scanner leia=new Scanner(System.in);
		
	int i=0, gen=0,genO=0,genM=0,genF=0,escala=0,nerv=0,calm=0,agress=0,
		mais40=0,menos18=0,maior40=0, menor18=0,femnerv=0, homagress=0, outrocalm=0;
	while(i<=3) {
		System.out.println("\nInsira os dados do novo paciente! ");
		i++;
		System.out.println("Defina seu genero, sendo 1 para Masculino,"
				+ " 2 para Feminino e 3 para outros: ");
		gen=leia.nextInt();
		if(gen==1){
			genM++;
		}
		if(gen==2){
			genF++;
		}
		if(gen==3){
			genO++;
		}
		System.out.println("Agora tecle 1, caso se considere calmo(a/e),"
				+ " \ntecle 2 caso se considere nervoso(a/e)"
				+ " \ne por ultimo caso se considere agressivo(a/e) tecle 3");
		escala=leia.nextInt();
		if(escala==1){
			calm++;
			System.out.println("Você tem menos de 18?"
					+ "\n caso sim, aperte 1, caso não aperte 2");
			menos18=leia.nextInt();
			if(menos18==1) {
				menor18++;
			               }
		             }
		if(escala==2){
			nerv++;
			System.out.println("Você tem mais de 40 anos?"
					+ "\n caso sim, aperte 1, caso não aperte 2");
			mais40=leia.nextInt();
			if(mais40==1) {
				maior40++;
			              }
		             }
		 if(escala==3){
			agress++;
		              }
		 if(escala==1 && gen==2) {
			femnerv++;
			                     }
		 if(escala==3 && gen==1) {
			homagress++;
		                         }
		 if(escala==1 && gen==3) {
			 outrocalm++;
		 }
			
	}
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("Foram entrevistados "+genM+" pessoas do genero Masculino");
	System.out.println("Foram entrevistadas "+genF+" pessoas do genero Feminino");
	System.out.println("Foram entrevistades "+genO+" pessoas de outros generos");
	System.out.println("Dentre elas "+calm+" se idenficavam como calma(o/e)");
	System.out.println("E "+menor18+" são menores de 18");
	System.out.println("Dentre elas "+nerv+" se idenficavam como nervosas(o/e)");
	System.out.println("E "+maior40+" tem mais de 40 anos");
	System.out.println("Dentre elas "+agress+" se idenficavam como agressivas(o/e)");
	Thread.sleep(10000);
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("Dados adicionais: ");
	System.out.println("Mulheres nervosas: "+ femnerv);
	System.out.println("Homens Agressivos: "+ homagress);
	System.out.println("Outros Calmos: "+ outrocalm);
	
}
}
