package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new HashSet<String>(); //conjuntos de inteiros
		aprovados.add("joao");
		aprovados.add("pedro");
		aprovados.add("maria");
		aprovados.add("rafael");
		
		for(String nome:aprovados) {
			System.out.println(nome);
		}
		
		

	}

}
