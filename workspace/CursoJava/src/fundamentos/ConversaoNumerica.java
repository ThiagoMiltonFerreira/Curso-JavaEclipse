package fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args) {
		//conversao EXPLICITA cast
		float f = (float) 0.1; // por padrao o java identifica o valor como double nescessitando de converter no numro ou colocar  float f = 0.1f pra identificar como float		
		System.out.println(f);
		
		//conversao IMPLICITA
		int i2 = 'T';
		System.out.println(i2);
		
		

	}

}
