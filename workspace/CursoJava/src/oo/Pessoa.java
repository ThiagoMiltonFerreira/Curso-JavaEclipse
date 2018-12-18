package oo;


public class Pessoa {
	/**
	 * peso em kilo
	 * al+Shift+j
	 *
	 */
	private double peso = 0;
	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}
	public double getPeso() {
		return peso;
	}
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	
}
