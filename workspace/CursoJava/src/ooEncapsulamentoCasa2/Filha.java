package ooEncapsulamentoCasa2;

import ooEncapsulamentoCasa1.Sogra;
import ooEncapsulamentoCasa1.Sogro;

public class Filha extends Sogra {  // herança classe filha erda da classe sogra
	
	//public class Filha extends Sogra { herança classe filha erda da classe sogra
	String segredoDoCasal = "Meu marido esta quase sendo demitido";  //Default consigo acessar do msm pacote
	
	public static void main(String[] args) {
	
		Filha euMesma = new Filha();
		System.out.println("Meus pais nao sabem..." + euMesma.segredoDoCasal);
		System.out.println(euMesma.segredoDeFamilia); // como a classe filha recebeu a sogra tenho que usar a instacia de filha que recebeu a erança
		//Genro meuAmor = new Genro();
		//System.out.println(meuAmor.segredo);
		  Sogro papai = new Sogro();
		  System.out.println(papai.gostaDeCerveja);
		  

		  
		
	}
}
