package vista.formaulario;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormPregunta extends JPanel {
	
	private JLabel lblTitulo;
	private CampoTexto txtPregunta;
	private CampoTexto txtRespuesta;
	private JComboBox cbTemas;
	private JComboBox cbCategorias;
	private JButton btnAgregarTema;
	private JPanel pnlTemas;
	
	public FormPregunta(String titulo) {
		this.lblTitulo = new JLabel(titulo + " Pregunta");
		this.txtPregunta = new CampoTexto("Pregunta: ");
		this.txtRespuesta = new CampoTexto("Respuesta: ");
		this.add(lblTitulo);
		this.add(txtPregunta);
		this.add(txtRespuesta);
		
	}

}