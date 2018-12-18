package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> aprovados = new HashMap<>();
		aprovados.put(1, "Pedro");
		aprovados.put(2, "Thiago");
		aprovados.put(3, "Joao");
		
		System.out.println(aprovados.keySet()); //mostra somente os indices
		System.out.println(aprovados.values()); // mostra todos nomes da lista
		System.out.println(aprovados.entrySet()); // mostra o nome com o indice
		 
		//aprovados.put(3, "Beatriz"); // substitui o valor referente ao indice
		System.out.println(aprovados.get(3)); //busca o resultado do  de onde esta
		System.out.println(aprovados.containsKey(2));
		System.out.println(aprovados.containsValue("Joao"));
		
		

	}

}
