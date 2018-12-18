package ControleDeEstoque;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class inicio {

	private JFrame frmInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio window = new inicio();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.setBounds(100, 100, 450, 300);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicio.getContentPane().setLayout(null);
		
		JButton btnKkk = new JButton("kkk");
		btnKkk.setBounds(207, 122, 89, 23);
		frmInicio.getContentPane().add(btnKkk);
	}
}
