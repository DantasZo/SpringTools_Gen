package br.com.generation.laçoscondicionasi;

import java.util.Locale;
import java.util.Scanner;

public class laçocondicional01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //caso queira usar o . como separador de valores no console
		
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("Digite a Primeira nota: ");
		nota1= entrada.nextDouble();
		System.out.println("Digite a Segunda nota: ");
		nota2= entrada.nextDouble();
		media= (nota1 + nota2)/2;
	
		//if - se
		//else - senao
		//else if - senao se
		
		if(media >= 7.0) {
		    System.out.println("Aprovado"+"\nSua media é: "+media);

		}   else if(media>= 3.0 && media<7.0) {
			System.out.println("Recuperação"+"\nSua media é: "+media);
		}
		
		else{
		    System.out.println("Reprovado"+"\nSua media é: "+media);

		}
		
	}

}
