package ControleDeEstoque;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Label;
import java.awt.Window;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JEditorPane;

public class PaginaInicialControleEstoque {

	private String usuario;
	private String senha;
	public JFrame frmControleDeEstoque;
	public JTextField txtUsuario;
	private JTextField txtSenha;
	private final Action action = new SwingAction();
	public String getTxtUsuario() {
		return txtUsuario.toString();
	}
	public void SetTxtUsuario() {
		this.usuario = txtUsuario.getText();
	}
	public String getTxtSenha() {
		return senha;
	}
	public void SetTxtSenha() {
		this.senha = txtSenha.getText();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicialControleEstoque window = new PaginaInicialControleEstoque();
					window.frmControleDeEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaginaInicialControleEstoque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		
		frmControleDeEstoque = new JFrame();
		frmControleDeEstoque.setResizable(false);
		frmControleDeEstoque.setAutoRequestFocus(false);
		frmControleDeEstoque.setTitle("Controle de Estoque -  0.1");
		frmControleDeEstoque.setBounds(100, 100, 327, 213);
		frmControleDeEstoque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControleDeEstoque.getContentPane().setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscaBanco buscaSenhaNoBanco = new BuscaBanco();
				buscaSenhaNoBanco.RecebeSenha(txtUsuario.getText().toUpperCase(),txtSenha.getText().toUpperCase());
				if(buscaSenhaNoBanco.isLogado())
				{
					//JOptionPane.showMessageDialog(null,"logado", "Logado Com sucesso!", JOptionPane.INFORMATION_MESSAGE);
					new Tela1().setVisible(true); // Abre tela inicial
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Usuario ou senha incorretos! ","Verificou a senha que foi atribuida e nao encontrou no banco.", JOptionPane.ERROR_MESSAGE);					
			
				}
			}
		});
		btnEntrar.setBounds(24, 127, 89, 23);
		frmControleDeEstoque.getContentPane().add(btnEntrar);
	
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(24, 46, 94, 20);
		frmControleDeEstoque.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(24, 96, 94, 20);
		frmControleDeEstoque.getContentPane().add(txtSenha);
		txtSenha.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(24, 29, 46, 14);
		frmControleDeEstoque.getContentPane().add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(24, 77, 46, 14);
		frmControleDeEstoque.getContentPane().add(lblSenha);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\ART\\Downloads\\icLogin.png"));
		label.setBounds(189, 29, 89, 121);
		frmControleDeEstoque.getContentPane().add(label);
		@SuppressWarnings("unused")
		Conexao con = new Conexao();
		
		
		
		
		
	}
	protected static void dispose() {
		// TODO Auto-generated method stub
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
