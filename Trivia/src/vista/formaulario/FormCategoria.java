package vista.formaulario;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FormCategoria extends JPanel {
	private JLabel lblTitulo;
	private CampoTexto txtCategoria;
	private JButton btnGuardar;
	
	public FormCategoria(String titulo) {
		this.setLayout(new BorderLayout());
		lblTitulo = new JLabel(titulo+" categoria");
		txtCategoria = new CampoTexto("Categoria: ");
		btnGuardar = new JButton("Guardar");
		
		this.add(BorderLayout.NORTH, lblTitulo);
		this.add(BorderLayout.CENTER, txtCategoria);
		this.add(BorderLayout.SOUTH, btnGuardar);
	}
	

		
	}


