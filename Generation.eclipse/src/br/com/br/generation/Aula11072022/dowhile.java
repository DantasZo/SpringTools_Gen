package br.com.br.generation.Aula11072022;

public class dowhile {

	public static void main(String[] args) throws InterruptedException {
		
		int i=0;
		do {
			System.out.println("contador:" + i);
			
			//loop
			i++;
			Thread.sleep(1111);
		} while(i<=10);                  //condição

	}

}
