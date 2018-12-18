package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPrimeiraTela {

	private JFrame frame;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrimeiraTela window = new ViewPrimeiraTela();
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
	public ViewPrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(110, 91, 46, 14);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(110, 116, 224, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton Mostrar = new JButton("Mostrar");
		Mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Nome: "+txtNome.getText());
			}
		});
		Mostrar.setBounds(173, 172, 89, 23);
		frame.getContentPane().add(Mostrar);
	}
}
