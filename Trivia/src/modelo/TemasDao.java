package modelo;

import java.util.List;

public interface TemasDao {
	public void addTema(Tema tema);
	public boolean readTema(Tema tema);
	public List<String> listaTemas();
	public void deleteTema(Tema tema);
	public void updateTema(Tema tema1, Tema tema2);
}
