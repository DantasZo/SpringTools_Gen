package br.com.generation.Exercicios14072022;

public class Imprime {

	public static void main(String[] args) {
		TestaAnimais f = new TestaAnimais();
		
		f.Nome(new Cavalo());
		
		f.Nome(new Cachorro());
		
		f.Nome(new Preguiça());
		
		f.Idade(new Cavalo());
		
		f.Idade(new Cachorro());
		
		f.Idade(new Preguiça());
	
        f.Som(new Cavalo());	
        
        f.Som(new Cachorro());	

        f.Som(new Preguiça());	
        
        f.Locomove(new Cavalo());
        f.Locomove(new Cachorro());
        f.Locomove(new Preguiça());
	}
}
