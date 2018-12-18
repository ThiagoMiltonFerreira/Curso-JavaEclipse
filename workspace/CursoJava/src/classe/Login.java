package classe;



public class Login {

	int login;
	int senha;
	String logado;
	String usuario;
	boolean logadoBooleano=false;
	String loga() {
		
		if(login==123 && senha ==456) {
			logadoBooleano=true;
			usuario="THIAGO MILTON FERREIRA";
			return logado="Logado com sucesso";
		
			
		
		
		}
		else
		{
			return logado="Verifique usuario e senha!";
		}
	}
}
