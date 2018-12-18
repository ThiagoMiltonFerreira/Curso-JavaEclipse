package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double notas = 0;
		int numeroDeNotas = 0;
		
		while (notas != -1)
		{
			System.out.println("Digite a nota: ".toUpperCase());
			notas=scanner.nextDouble();
			somaDasNotas+=notas;
			numeroDeNotas++;
			
		}
		System.out.println("A media é: "+somaDasNotas/numeroDeNotas);
		scanner.close();
	}

}
