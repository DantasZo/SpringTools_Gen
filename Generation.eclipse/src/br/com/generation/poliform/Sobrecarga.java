package br.com.generation.poliform;

public class Sobrecarga {
	public static void main(String[] args) {

		linha('x',10);
		linha('*');
		linha();
	}

	public static void linha(char tipo, int tamanho) {
		System.out.println("1 versão: ");
		for(int i = 0;i <= tamanho; i++) {
			System.out.printf("%c",tipo);
		}
		System.out.println();
	}


	public static void linha(char tipo) {
		System.out.println("2 versão: ");
		for(int i = 0;i <= 10; i++){
			System.out.printf("%c",tipo);
		}
		System.out.println();
	}
	public static void linha() {
		System.out.println(" versão: ");
		for(int i = 0;i <= 10; i++){
			System.out.printf("x");
		}
		System.out.println();
	}
}


