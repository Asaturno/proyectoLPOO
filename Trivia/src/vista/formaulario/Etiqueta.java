package vista.formaulario;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Etiqueta extends JPanel{
	private JLabel lblTxt;
	private JButton btnEliminar;
	
public Etiqueta(String texto) {
	this.setBorder(new EmptyBorder(10,10,10,10));
}
}
