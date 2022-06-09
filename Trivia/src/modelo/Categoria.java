package modelo;
import java.util.List;

public class Categoria implements CategoriasDao{
	
	private String nomCategoria;
	private List<String> categorias;

	public String getNomCategoria() {
		return nomCategoria;
	}

	public void setNomCategoria(String nomCategoria) {
		this.nomCategoria = nomCategoria;
	}

	@Override
	public void addCategoria(Categoria categoria) {
		categorias.add(categoria.nomCategoria);
	}

	@Override
	public boolean readCategoria(Categoria categoria) {
		if(categorias.contains(categoria.nomCategoria)) {
			return true;
		}
		return false;
	}

	@Override
	public List<String> listaCategorias() {
		return categorias;
	}

	@Override
	public void deleteCategoria(Categoria categoria) {
		categorias.remove(categoria.nomCategoria);
	}

	@Override
	public void updateCategoria(Categoria categoria1, Categoria categoria2) {
		categorias.remove(categoria1.nomCategoria);
		categorias.add(categoria2.nomCategoria);
	}

}
