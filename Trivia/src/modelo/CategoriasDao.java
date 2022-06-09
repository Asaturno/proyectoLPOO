package modelo;

import java.util.List;

public interface CategoriasDao {
	public void addCategoria(Categoria categoria);
	public boolean readCategoria(Categoria categoria);
	public List<Categoria> listaCategorias();
	public void deleteCategoria(Categoria categoria);
	public void updateCategoria(Categoria categoria1, Categoria categoria2);
}