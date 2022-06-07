package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import vista.formaulario.FormCategoria;
import vista.reporte.*;

public class FrmPrincipalVen extends JFrame{
	
	private JTabbedPane tpnPrincipal;
	
	
public FrmPrincipalVen() {
	
	
	this.setSize(300, 300);
	this.setLocationRelativeTo(null);
	this.setTitle("Trivia");
	
	this.init();
	
}

private void init() {
	tpnPrincipal = new JTabbedPane();
	tpnPrincipal.addTab("Preguntas", new RepoPregunta());
	tpnPrincipal.addTab("Categorias", new RepoCategoria());
	tpnPrincipal.addTab("Temas", new RepoTema());
	tpnPrincipal.addTab("Prueba", new FormCategoria("Alta "));
	
	this.getContentPane().add(tpnPrincipal);
	
	
	
}


}
