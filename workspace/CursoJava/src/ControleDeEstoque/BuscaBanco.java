package ControleDeEstoque;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class BuscaBanco {
Conexao con = new Conexao();

	

    private String id;
    private String usuario;
    private String senha;
    private boolean logado;
    //String usuarioBanco;
    //String senhaBanco;
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isLogado() {
		return logado;
	}
	public void setLogado(boolean logado) {
		this.logado = logado;
	}
    public void RecebeSenha(String RecebeUsuario,String RecebeSenha){
    
    	/**String sql = "SELECT * FROM tbl_usuario where senha= '"+RecebeSenha+"'";
    	ResultSet rs = con.executaBusca(sql);
		JOptionPane.showMessageDialog(null,"buscando", "FUNCIONO111", JOptionPane.ERROR_MESSAGE);

    	try {
			while (rs.next()) {
							
				
				
				
				/**s1.SetTxtUsuario();
				s1.SetTxtSenha();
				if (usuario==s1.getTxtUsuario() && senha==s1.getTxtSenha()) {
					JOptionPane.showMessageDialog(null, usuario, senha, JOptionPane.ERROR_MESSAGE);
				}
				System.out.println(idSistema+" - "+id+" - "+nome+" - "+qtd+" - "+valor+" - "+promocao);
				 **/
    	
    	String sql = "SELECT * FROM tbl_usuario ";
    	ResultSet rs = con.executaBusca(sql);
    	
	
    	try {
			while (rs.next()) {
				this.id = rs.getString("id");
				this.senha=rs.getString("senha");
				this.usuario = rs.getString("usuario");
			
					//TESTES
					//System.out.println("Senha do banco - "+armazenaSenhaProvisoramente);			
					//System.out.println("Senha Recebida - "+RecebeSenha);
					//System.out.println(id+" - "+armazenaSenhaProvisoramente+" - "+usuario);
					//System.out.println(armazenaSenhaProvisoramente.equals(RecebeSenha));			
					//if(armazenaSenhaProvisoramente.equals(RecebeSenha)) {
				
				
				
				if(this.senha.equals(RecebeSenha)&&this.usuario.equals(RecebeUsuario)) {
						setSenha(RecebeSenha);
						setLogado(true);
						//JOptionPane.showMessageDialog(null,"A senha do usuario � - "+this.senha, "Verificou a senha e atribuiu para a variavel privada", JOptionPane.ERROR_MESSAGE);
						break;
						
					}
					
								
				}
			}
		 catch (Exception e) {
		
			e.printStackTrace();
		}
		//System.out.println("Senha-"+this.senha);
    
    	
    	
}
}
	

