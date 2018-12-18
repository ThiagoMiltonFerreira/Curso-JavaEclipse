package controle;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sacaner= new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int qtsVezesRodou=0;
	
		for (int cont=0;cont!=3;cont++,qtsVezesRodou++ ) {
			System.out.println("Digite a nota".toUpperCase());
			nota =sacaner.nextInt();
			somaDasNotas += nota;
		}
		System.out.println("A media e "+somaDasNotas/qtsVezesRodou);
	}

}
