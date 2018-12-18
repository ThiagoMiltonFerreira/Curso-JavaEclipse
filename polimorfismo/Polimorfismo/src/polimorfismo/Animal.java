package polimorfismo;

public abstract class Animal {
	//Atributos de animal
	private float peso;
	private float idade;
	private float membro;
	//Metodos de animal
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getIdade() {
		return idade;
	}
	public void setIdade(float idade) {
		this.idade = idade;
	}
	public float getMembro() {
		return membro;
	}
	public void setMembro(float membro) {
		this.membro = membro;
	}
	
	
}
