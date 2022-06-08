package vista.formaulario;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Etiqueta extends JPanel{
	private JLabel lblEtiqueta;
	private JButton btnEliminar;
	
	public Etiqueta(String texto) {
		this.lblEtiqueta = new JLabel(texto);
		this.btnEliminar = new JButton("x");
		
		this.setBorder(BorderFactory.createRaisedBevelBorder());
		this.setLayout(new FlowLayout());
		this.add(lblEtiqueta);
		this.add(btnEliminar);
	}
}
