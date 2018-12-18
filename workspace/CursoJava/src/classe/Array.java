package classe;

public class Array {

	public static void main(String[] args) {
		double totalNotas = 0;
		double[] notas = {7.0,.7,1};
		
		
		double[] notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 5.0;
		int i = 0;
		for(double VerificaNotasPedro:notasPedro) { // passa por todos campos do array(notasPedro) e maneira mais correta de fazer verificaçao de array
			totalNotas+=VerificaNotasPedro;
			System.out.println(totalNotas);
			System.out.println("Posicao : "+i);
			i++;
		}
		
		
	}
	
	

}
