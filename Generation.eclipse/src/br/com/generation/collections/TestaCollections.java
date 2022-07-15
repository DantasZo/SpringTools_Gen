package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {

		String aula1 = "Bloco 1 - java puro";
		String aula2 = "Bloco 2 - SpringBoot";
		String aula3 = "Bloco 3 - FrontEnd" ;
		String aula4 = "Bloco 4 - Java mobile";

		ArrayList<String> ListaAulas = new ArrayList<>();

		ListaAulas.add(aula1);
		ListaAulas.add(aula2);
		ListaAulas.add(aula3);
		ListaAulas.add(aula4);

		/* System.out.println(ListaAulas);
     ListaAulas.remove(2);
     System.out.println(ListaAulas);

		//for -->each

      /* for(String i: ListaAulas) {
    	  System.out.println(i);*/
	//}//

	/* String aula = ListaAulas.get(1);
        System.out.println(aula);*/
		
	  /* for(int i = 0; i < ListaAulas.size(); i++) {
		   System.out.println(i+ " | "+ ListaAulas.get(i));
		   System.out.println("Tamanho da lista "+ListaAulas.size());   
	   }*/
		
		Collections.sort(ListaAulas);
		System.out.println(ListaAulas);
		
		Collections.shuffle(ListaAulas);
		System.out.println(ListaAulas);
		
		
		
}

}
