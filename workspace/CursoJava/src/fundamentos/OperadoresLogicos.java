package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean ComprouTv50 = executouTrabalho1 && executouTrabalho2;
		boolean ComprouTv32 = executouTrabalho1 ^ executouTrabalho2; //somente uma opcao estiver correta
		
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("TV 50 = " + ComprouTv50);
		System.out.println("TV 32  = " + ComprouTv32);
		
		System.out.println("Fome = " + !comprouSorvete);
		
		

	}

}
