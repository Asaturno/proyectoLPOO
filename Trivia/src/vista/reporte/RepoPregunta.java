package vista.reporte;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
		this.setLayout(new BorderLayout());
		
		this.init();

	}
	
	public void init() {
		btnAgregar = new JButton("Agregar Pregunta");
		btnAgregar.setActionCommand(Comandos.VEN_ALTA_PREGUNTA);
		btnAgregar.addActionListener(this.vista);
		
		this.tblPreguntas = new JTable();
		this.tblPreguntas.setModel(new DefaultTableModel(new Object[][] {}, new String[] {"Pregunta", "Temas", "Categoria"}));
		lblTitulo = new JLabel("Preguntas");
		
		this.add(BorderLayout.NORTH, lblTitulo);
		this.add(BorderLayout.CENTER, new JScrollPane(tblPreguntas));
		this.add(BorderLayout.SOUTH, btnAgregar);
	}
	
	

}
