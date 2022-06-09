package modelo;
import java.util.List;

public class Categoria implements CategoriasDao{
	
	private String nomCategoria;

	public String getNomCategoria() {
		return nomCategoria;
	}

	public void setNomCategoria(String nomCategoria) {
		this.nomCategoria = nomCategoria;
	}

	@Override
	public void addCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean readCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Categoria> listaCategorias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategoria(Categoria categoria1, Categoria categoria2) {
		// TODO Auto-generated method stub
		
	}

}
