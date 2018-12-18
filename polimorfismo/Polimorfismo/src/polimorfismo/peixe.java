package polimorfismo;

public class peixe extends Animal {
	private String corEscama;
	@Override
	public void locomover() {
	
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
	
		System.out.println("Comendo substancias");
		
	}

	@Override
	public void emitirSom() {
	
		System.out.println("Soltando bolha");
		
	}
	
	//colocar dados e puxar dados
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
