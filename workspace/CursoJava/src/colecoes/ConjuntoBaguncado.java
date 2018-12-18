package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		
		// ***** o conjunto nao pode ter mesmo valor no mesmo conjunto ((((da erro)))
		 Set conjunto = new HashSet();
		 conjunto.add('a'); //Adiciona o valor ao conjunto
		 conjunto.add(2);
		 conjunto.remove(2);//remove o 2 do conjunto...
		 
		 System.out.println(conjunto.size()); //tamanho do conjunto
		 System.out.println(conjunto.contains('a')); //varifica se no conjunto tem A
		  
		 Set conjunto2 = new HashSet(); //novo conjunto
		 conjunto2.add('a');
		 System.out.println(conjunto2.retainAll(conjunto));
		 
		conjunto.clear();// limpa todo o conjunto
		System.out.println(conjunto.isEmpty()); //verifica se esta vazio retorna verdadeiro ou falso...
		
		 
		 
		 
		 
		 
		 
	}
}
