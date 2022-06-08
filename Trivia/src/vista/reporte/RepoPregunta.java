package vista.reporte;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import Principal.Trivia;
import vista.Comandos;
import vista.DlgAltaPregunta;
import vista.FrmPrincipalVen;

public class RepoPregunta extends JPanel{
	
	public FrmPrincipalVen vista;
	
	private JLabel lblTitulo;
	private JTable tblPreguntas;
	private JButton btnAgregar;
	
	private DlgAltaPregunta venAltaPregunta;
	
	public RepoPregunta(FrmPrincipalVen vista) {
		this.vista = vista;
		
		btnAgregar = new JButton("Agregar Pregunta");
		btnAgregar.setActionCommand(Comandos.VEN_ALTA_PREGUNTA);
		btnAgregar.addActionListener(this.vista);
		
		tblPreguntas = new JTable();
		lblTitulo = new JLabel("Preguntas");
		
		this.setLayout(new BorderLayout());
		
		this.add(BorderLayout.NORTH, lblTitulo);
		this.add(BorderLayout.CENTER, tblPreguntas);
		this.add(BorderLayout.SOUTH, btnAgregar);

	}
	
	

}
