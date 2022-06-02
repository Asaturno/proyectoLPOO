package modelo;

public class Categoria {
	
	private String[] cadena_categorias;

	public String[] getCadena_categorias() {
		return cadena_categorias;
	}
	
	public void addCategoria(String categoria) {
		for (int i=0; i<100; i++) {
			if(this.cadena_categorias[i]==null) {
				this.cadena_categorias[i]=categoria;
				break;
			}
		}
	}
	
	
	
	

}
