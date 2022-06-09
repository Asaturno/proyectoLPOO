package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import controlador.ControlTrivia;
import vista.formaulario.FormCategoria;
import vista.reporte.*;

public class FrmPrincipalVen extends JFrame implements ActionListener{
	
	//Inyeccion de dependencias
	private ControlTrivia control;
	
	private JTabbedPane tpnPrincipal;
	private DlgAltaPregunta venAltaPregunta;
	private DlgAltaCategoria venAltaCategoria;
	private DlgAltaTema venAltaTema;
	
	public FrmPrincipalVen() {
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("Trivia");
		
		this.init();
		
	}
	
	private void init() {
		
		
		tpnPrincipal = new JTabbedPane();
		tpnPrincipal.addTab("Preguntas", new RepoPregunta(this));
		tpnPrincipal.addTab("Categorias", new RepoCategoria(this));
		tpnPrincipal.addTab("Temas", new RepoTema(this));
		
		this.getContentPane().add(tpnPrincipal);
		
		this.venAltaPregunta = new DlgAltaPregunta(this, true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		switch(comando) {
			case Comandos.VEN_ALTA_PREGUNTA:
				this.venAltaPregunta.setVisible(true);
				break;
			case Comandos.VEN_ALTA_CATEGORIA:
				this.venAltaCategoria.setVisible(true);
				break;
			case Comandos.VEN_ALTA_TEMA:
				this.venAltaTema.setVisible(true);
				break;
		}
	}

	public void setControl(ControlTrivia control) {
		this.control = control;
	}


}
