package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin {

	private JFrame frame;
	private JTextField txtLogin;
	private JButton btnEntrar;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 456, 294);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(39, 33, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(37, 50, 255, 29);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(39, 105, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				//a��o do btn
				
				if(checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))) {
					
					JOptionPane.showMessageDialog(null, "Bem vido ao sistema!!");
					JOptionPane.showMessageDialog(null, checkLogin(txtLogin.getText(), new String(txtSenha.getPassword())));
					//o JOPtionPane a cima me retorna true ou falso pega o login e senha e passa para classe verificadora(ckeck login) 
					// como parametro
				}else
				{
					JOptionPane.showMessageDialog(null, "Dados Invalidos","Meu titulo",JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
			
		});
		btnEntrar.setBounds(110, 184, 89, 34);
		frame.getContentPane().add(btnEntrar);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(39, 121, 253, 29);
		frame.getContentPane().add(txtSenha);
	}
	
	
	//classe criada nao vem como padrao
	public boolean checkLogin(String login,String senha) {
		return login.equals("usuario") && senha.equals("123");    // se for igual retorna true se nao false
	}
	
	
}
