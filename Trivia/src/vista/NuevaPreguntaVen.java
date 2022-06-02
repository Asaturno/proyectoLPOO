package vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Categoria;
import modelo.Lista;

public class NuevaPreguntaVen extends JFrame{
	//private Categoria categoria;
	private Lista categoria; 
	private Lista tema;
	
	public NuevaPreguntaVen() {
		
		//prueba ComboBox Multiples clases
		//categoria.addCategoria("lal");
		
		//prueba para las ComboBox
		/*
				this.categoria.addOpcion("categoria 1");
				this.tema.addOpcion("tema 1");
				this.categoria.GeneraArreglo();
				this.tema.GeneraArreglo();
			
		*/
		
		
		
		JPanel panel_txt = new JPanel(new GridLayout(2,2));
		JTextField txt_pregunta = new JTextField();
		JTextField txt_respuesta = new JTextField();
		JLabel lbl_pregunta = new JLabel("Pregunta: ");
		JLabel lbl_respuesta = new JLabel("Respuesta: ");
		
		panel_txt.add(lbl_pregunta);
		panel_txt.add(txt_pregunta);
		panel_txt.add(lbl_respuesta);
		panel_txt.add(txt_respuesta);
		panel_txt.setBorder(new EmptyBorder(5,5,5,5));
		
		this.getContentPane().add(BorderLayout.NORTH, panel_txt);
		
		
		JPanel panel_sur = new JPanel(new GridLayout (1, 2));
		JPanel panel_tema = new JPanel(new GridLayout(2,2));
		JButton btn_nuevo = new JButton("+");
		Component blank = Box.createRigidArea(new Dimension(10, 10));
		JLabel lbl_temas = new JLabel(); //falta poner las etiquetas de los temas seleccionados
		//JComboBox<String> lista_temas = new JComboBox<String>(tema.getOpciones());
		JComboBox<String> lista_categorias = new JComboBox<String>();
		
		//panel_tema.add(lista_temas);
		panel_tema.add(btn_nuevo);
		panel_tema.add(blank);
		panel_tema.add(lbl_temas);
		
		panel_sur.add(panel_tema);
		panel_sur.add(lista_categorias);
		
	}
	
	public static void main(String[] args) {
		
		//prueba para la ComboBox
		
		
		
		
		NuevaPreguntaVen v = new NuevaPreguntaVen();
		
		v.setVisible(true);
		v.setBounds(100, 100, 100, 100);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
