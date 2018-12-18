package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sacaner= new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int qtsVezesRodou=0;
		do {
			nota= sacaner.nextDouble();
			somaDasNotas +=nota;
			qtsVezesRodou++;
		}while(nota != -1);
		System.out.println("Amedia é" + somaDasNotas/qtsVezesRodou);
	}

}
