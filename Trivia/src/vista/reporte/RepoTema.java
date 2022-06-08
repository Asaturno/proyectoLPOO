package vista.reporte;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vista.Comandos;
import vista.FrmPrincipalVen;

public class RepoTema extends JPanel {
	public FrmPrincipalVen vista;
	
	private JLabel lblTitulo;
	private JTable tblTemas;
	private JButton btnAgregar;
	
	public RepoTema(FrmPrincipalVen vista) {
		this.vista = vista;
		this.setLayout(new BorderLayout());
		
		this.init();
	}
	
	public void init() {
		btnAgregar = new JButton("Agregar Tema");
		btnAgregar.setActionCommand(Comandos.VEN_ALTA_TEMA);
		btnAgregar.addActionListener(this.vista);
		
		this.tblTemas = new JTable();
		this.tblTemas.setModel(new DefaultTableModel(new Object[][] {}, new String[] {"Tema"}));
		lblTitulo = new JLabel("Temas");
		
		this.add(BorderLayout.NORTH, lblTitulo);
		this.add(BorderLayout.CENTER, new JScrollPane(tblTemas));
		this.add(BorderLayout.SOUTH, btnAgregar);
	}


}
