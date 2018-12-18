package classe;

public class Calculadora {
 
	double resultado;
	double somar(double a, double b) {
		resultado = a+b;
		return resultado;     // SOMA A VARIAVEL RESULTADO E RETORNA
	}
	void acrescentar(double a) {
		resultado +=a;     // INCREMENTA A VARIAVEL RESULTADO..
	} 
	
	double obterResultado() {
	 	return resultado;  // SOMENTE RETORNA O RESULTADO 
	}
	
	void limpar() {
		resultado = 0;   // LIMPA O VALOER DE RESULTADO
	}
}
