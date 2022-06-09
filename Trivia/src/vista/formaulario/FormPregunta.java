package vista.formaulario;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class FormPregunta extends JPanel {
	
	private JLabel lblTitulo;
	private CampoTexto txtPregunta;
	private CampoTexto txtRespuesta;
	private JComboBox cbTemas;
	private JComboBox cbCategorias;
	private JButton btnAgregarTema;
	private JPanel pnlTemas;
	
	public FormPregunta(String titulo) {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBorder(new EmptyBorder(5,5,5,5));
		
		this.lblTitulo = new JLabel(titulo + " Pregunta");
		this.txtPregunta = new CampoTexto("Pregunta: ");
		this.txtRespuesta = new CampoTexto("Respuesta: ");
		this.cbCategorias = new JComboBox();
		this.cbTemas = new JComboBox();
		//this.cbTemas.setSize(200, 30);
		this.cbTemas.setPreferredSize(new Dimension(400, 30));
		this.btnAgregarTema = new JButton("+");
		
		JPanel pnlTemas = new JPanel(new FlowLayout());
		pnlTemas.add(cbTemas);
		pnlTemas.add(btnAgregarTema);
		
		JPanel pnlListaTemas = new JPanel(new FlowLayout());
		pnlListaTemas.setBorder(BorderFactory.createLoweredBevelBorder());
		pnlListaTemas.add(new Etiqueta("Prueba1"));
		pnlListaTemas.add(new Etiqueta("Prueba2"));
		pnlListaTemas.add(new Etiqueta("Prueba3"));
		pnlListaTemas.add(new Etiqueta("Prueba4"));
		JScrollPane scroll = new JScrollPane(pnlListaTemas);
		scroll.setBorder(new EmptyBorder(10,10,10,10));
		
		this.add(lblTitulo);
		this.add(txtPregunta);
		this.add(txtRespuesta);
		this.add(pnlTemas);
		this.add(scroll);
		this.add(cbCategorias);
		
	}

}