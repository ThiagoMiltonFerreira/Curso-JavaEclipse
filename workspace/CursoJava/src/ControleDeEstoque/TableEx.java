package ControleDeEstoque;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import java.awt.BorderLayout;

public class TableEx {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableEx window = new TableEx();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class TableData extends AbstractTableModel{

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 3;
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return 3;
		}
		BuscaBanco s =new BuscaBanco();
		
		BuscaBanco buscaSenhaNoBanco = new BuscaBanco();
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			buscaSenhaNoBanco.RecebeSenha("THIAGO", "123");
			return buscaSenhaNoBanco.getUsuario(); 
		}
		
	}

	/**
	 * Create the application.
	 */
	public TableEx() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table = new JTable();
		frame.getContentPane().add(table, BorderLayout.CENTER);
		TableData td = new TableData();
		table.setModel(td);
	}
	

}
