package br.com.generation.interfaces;

public class ImprimeAnimal {
	
	public static void main(String[] args) {
		TestaAnimais f = new TestaAnimais();
		
		f.fazerAnimalComer(new Cachorro());
		f.fazerAnimalComer(new tigre());
	}

}
