package br.com.br.generation.Aula11072022;

public class laçowhile2 {
	public static void main(String[] args) throws InterruptedException {
	 
		int contador=10; // ---> inicialização
		
		
		while(contador>=1) {
			//condição para quando a condição for true
		
			//após while é o loop
			Thread.sleep(1111);//instrução de atraso baseado em milisegundos
        System.out.println(contador);
			contador--; //incremento
}       
		System.out.println(contador);
}
}
