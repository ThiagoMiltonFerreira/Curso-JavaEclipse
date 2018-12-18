package polimorfismo;

public class Reptil extends Animal {
	private String corEscama;
	@Override
	public void locomover() {

		System.out.println("Rastejando");
	}

	public void alimentar() {
		System.out.println("comendo vejetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de reptil");
		
	}
	//colocar dados e puxar dados
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
 
}
