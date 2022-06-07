package vista.reporte;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class RepoPregunta extends JPanel  {
	private JLabel lblTitulo;
	private JTable tblPreguntas;
	private JButton btnAgregar;
	
	public RepoPregunta() {
		btnAgregar = new JButton("Agregar Pregunta");
		tblPreguntas = new JTable();
		lblTitulo = new JLabel("Preguntas");
		
		this.setLayout(new BorderLayout());
		
		this.add(BorderLayout.NORTH, lblTitulo);
		this.add(BorderLayout.CENTER, tblPreguntas);
		this.add(BorderLayout.SOUTH, btnAgregar);

}

}
