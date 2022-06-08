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

public class RepoCategoria extends JPanel {
	public FrmPrincipalVen vista;
	
	private JLabel lblTitulo;
	private JTable tblCategorias;
	private JButton btnAgregar;
	
	public RepoCategoria(FrmPrincipalVen vista) {
		this.vista = vista;
		this.setLayout(new BorderLayout());
		
		this.init();
	}
	
	public void init() {
		btnAgregar = new JButton("Agregar Categoria");
		btnAgregar.setActionCommand(Comandos.VEN_ALTA_CATEGORIA);
		btnAgregar.addActionListener(this.vista);
		
		this.tblCategorias = new JTable();
		this.tblCategorias.setModel(new DefaultTableModel(new Object[][] {}, new String[] {"Categoria"}));
		lblTitulo = new JLabel("Categorias");
		
		this.add(BorderLayout.NORTH, lblTitulo);
		this.add(BorderLayout.CENTER, new JScrollPane(tblCategorias));
		this.add(BorderLayout.SOUTH, btnAgregar);
	}


}
