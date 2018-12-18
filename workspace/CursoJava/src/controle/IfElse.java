package controle;

public class IfElse {

	public static void main(String[] args) {
		double nota = 9;
		boolean pagto = true;
		
		if (nota >= 7 && pagto) {
			System.out.println("Aprovado!\npagto: "+pagto);
		}else
		{
			System.out.println("Reprovado\nPagto: "+pagto);
		}
	}

}
