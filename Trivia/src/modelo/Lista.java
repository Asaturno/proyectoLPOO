package modelo;

import java.util.ArrayList;
import java.util.List;


public class Lista {
	
	private List<String> lista = new ArrayList<String>();
	private String opciones[];
	
	
	
	
	public Lista() {
		super();
	}
	
	public String[] getOpciones() {
		return this.opciones;
	}

	public void addOpcion(String val) {
	
		lista.add(val);
	}
	
	public void GeneraArreglo() {
		for(int i=0; i<this.lista.size(); i++) {
			this.opciones[i]=this.lista.get(i);
	    }
	}
	
	
	
	

}
