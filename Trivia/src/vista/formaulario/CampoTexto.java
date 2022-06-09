package vista.formaulario;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CampoTexto extends JPanel{
	
	public CampoTexto(String txt) {
		JLabel lblTxt = new JLabel(txt);
		JTextField txtField = new JTextField(20);
		
		this.setLayout(new FlowLayout());
		this.add(lblTxt);
		this.add(txtField);
		
	}

}
