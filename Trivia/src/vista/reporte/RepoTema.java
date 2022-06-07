package vista.reporte;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class RepoTema extends JPanel {
	private JLabel lblTitulo;
	private JTable tblTema;
	private JButton btnAgregar;
	
	public RepoTema() {
		btnAgregar = new JButton("Agregar Pregunta");
		tblTema = new JTable();
		lblTitulo = new JLabel("Temas");
		
		this.setLayout(new BorderLayout());
		
		this.add(BorderLayout.NORTH, lblTitulo);
		this.add(BorderLayout.CENTER, tblTema);
		this.add(BorderLayout.SOUTH, btnAgregar);
	}


}
