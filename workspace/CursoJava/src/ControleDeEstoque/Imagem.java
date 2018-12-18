package ControleDeEstoque;

import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Imagem extends JFrame {

	ImageIcon imagem = new ImageIcon(getClass().getResource("ImgLogin.jpg"));
	JLabel label = new JLabel(imagem);
	
	public Imagem() {
		add(label);
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Imagem();
	}
}
