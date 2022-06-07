package vista.reporte;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class RepoCategoria extends JPanel {
	private JLabel lblTitulo;
	private JTable tblCategorias;
	private JButton btnAgregar;
	
	public RepoCategoria() {
		btnAgregar = new JButton("Agregar Pregunta");
		tblCategorias = new JTable();
		lblTitulo = new JLabel("Categorias");
		
		this.setLayout(new BorderLayout());
		
		this.add(BorderLayout.NORTH, lblTitulo);
		this.add(BorderLayout.CENTER, tblCategorias);
		this.add(BorderLayout.SOUTH, btnAgregar);
	}


}
