package treinoHerancaCarro;

public class carro {
	int velocidadeAtual = 0;
	protected int acelera() {
		return velocidadeAtual+=10;
		 
	}
	protected int freiar(int valorFreio) {
		return velocidadeAtual-=valorFreio;
		 
	}
	

}
