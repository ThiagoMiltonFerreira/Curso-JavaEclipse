package colecoes;

import java.awt.List;
import java.util.ArrayList;

public class lista {

	public static void main(String[] args) {
		ArrayList aprovados = new ArrayList();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		
		System.out.println("Get..");
		System.out.println("Posicao 0 "+aprovados.get(0));
		System.out.println("Posicao 1 "+aprovados.get(1));
		System.out.println("Size..."+aprovados.size());
		

	}

}
