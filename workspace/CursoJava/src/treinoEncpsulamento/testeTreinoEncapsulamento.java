package treinoEncpsulamento;

public class testeTreinoEncapsulamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treinoEncapsulamento teste = new treinoEncapsulamento();
		System.out.println(teste.verificaUsuario());
		
		if(teste.verificaUsuario()==true) {
			treinoMenuInicial teste2 = new treinoMenuInicial();
			teste2.menuInicio();
		}
		else
		{
			System.out.println("Verifique usuario e senha!!");
		}
	
		
		
	
		
		

	}

}
