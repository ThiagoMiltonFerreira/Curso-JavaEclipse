package ooEncapsulamentoCasa2;

import ooEncapsulamentoCasa1.Sogro;

public class Genro {

	private String segredo = "Minha sogra fala demais!!";
	
	public static void main(String[] args) {
		
		Genro euMesmo = new Genro();
		System.out.println("Nunca Falarei "+euMesmo.segredo); // private somente dentro da classe
		
		Filha MeuAmor = new Filha(); 
		System.out.println(MeuAmor.segredoDoCasal);  //classe default... consigo acessar msm pacote
		
		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja); // classe publica
		
		//Sogra sogrinha = new Sogra();
		//System.out.println(sogrinha.segredoDeFamilia); 
		
		
		
		
	}
}
