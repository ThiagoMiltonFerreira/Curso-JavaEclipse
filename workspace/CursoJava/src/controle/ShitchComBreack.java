package controle;

public class ShitchComBreack {

	public static void main(String[] args) {
		String conceito ="";
		int nota = 88;
		switch(nota) {
		case 10: case 9: conceito = "A"; break;
		case 8: case 7: conceito = "B"; break;
		case 6: case 5: conceito = "C"; break;
		default : conceito = null; break;
		}
		if(conceito != null) {
			System.out.println("Conceito : "+conceito);
		}
		else
		{
			System.out.println("Nota Invalida");
		}
		
		}

	}

