package br.com.generation.OperadoresLogicos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		//And --> e  --> && ----------> duas comparações, ambas comparações 
		//devem retornar true

		int idade= 20;
		boolean precisavotar = idade >= 18 && idade < 70;
		System.out.println(precisavotar);
		
		
	 //Or --> ou -> || vai ser true de um dos dois for true 
		
		int nrAmarelo = 2,nrVermelho = 1;
		boolean suspenso = nrAmarelo ==2 || nrVermelho ==1;
		System.out.println(suspenso);
	 //Xor --> ou exclusivo -> ^ -> Apenas uma das duas pode ser true,
     //se as duas derem true o resultado é false
		
		int x = 11, y=11;
		boolean teste = x > 10  ^ y >11;
		System.out.println(teste);
 		
		
		
	 //Not --> negação -----> !*/, tras o resultado contrario a condição
	 // verdadeiro = falso e falso = verdadeiro
		
		int qnt = 20;
		boolean maiorqnt = !(qnt >= 18);
		System.out.println(maiorqnt);
		
	
	
	}

}
