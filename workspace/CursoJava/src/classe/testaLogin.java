package classe;

public class testaLogin {

	public static void main(String[] args) {
		Login verificaLogin = new Login();
		verificaLogin.login=123;
		verificaLogin.senha=456;
		
		System.out.println(verificaLogin.loga());
		
		if(verificaLogin.logadoBooleano==true) 
		{
			System.out.println("Bem Vindo "+verificaLogin.usuario);
		}
	
	}

}
