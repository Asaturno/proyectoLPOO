package vista;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JPanel;

import vista.formaulario.FormPregunta;

public class DlgAltaPregunta extends JDialog{

	private JPanel pnlAltaPregunta;
	
	public DlgAltaPregunta(Frame parent, boolean modal) {
		super(parent, modal);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(parent);
		this.setSize(500, 400);
		
		this.init();
	}
	
	public void init() {
		this.pnlAltaPregunta = new FormPregunta("Alta");
		
		this.getContentPane().add(pnlAltaPregunta);
	}
	
	

}
