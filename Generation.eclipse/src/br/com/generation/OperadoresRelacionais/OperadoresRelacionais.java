package br.com.generation.OperadoresRelacionais;

public class OperadoresRelacionais {
	public static void main(String[] args) {
	    /* 
		<  menor que
		>  maior que
		== Igual
		!= diferente
		<= menor ou igual que
		>= maior ou igual que
		*/
	
		int b = 10;
		b+=9;
		b++;
		System.out.println(b);
		
		int idade = 10;
		//boolean maioridade = idade > 18;
		//boolean maioridade = idade >= 18;
		//boolean maioridade = idade < 18;
		//boolean maioridade = idade <= 18;
		//boolean maioridade = idade == 18;
		boolean maioridade = idade != 18;
		
		System.out.println(maioridade);
		
}

}
