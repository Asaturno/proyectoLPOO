package vista;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrmPrincipalVen extends JFrame{
	
public FrmPrincipalVen() {
	
	
	this.setSize(300, 300);
	this.setLocationRelativeTo(null);
	this.setTitle("Trivia");
	
	this.init();
	
}

private void init() {
	JButton btnGuardar = new JButton("Guardar");
	this.add(btnGuardar);
	
	
}


}
