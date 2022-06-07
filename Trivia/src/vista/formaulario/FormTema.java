package vista.formaulario;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormTema extends JPanel {
	private JLabel lblTitulo;
	private CampoTexto txtTema;
	private JButton btnGuardar;
	
	public FormTema(String titulo) {
		this.setLayout(new BorderLayout());
		lblTitulo = new JLabel(titulo+" categoria");
		txtTema = new CampoTexto("Tema: ");
		btnGuardar = new JButton("Guardar");
		
		this.add(BorderLayout.NORTH, lblTitulo);
		this.add(BorderLayout.CENTER, txtTema);
		this.add(BorderLayout.SOUTH, btnGuardar);
	}

}
