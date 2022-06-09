package modelo;

import java.util.List;

public class Tema implements TemasDao {
	private String nomTema;
	private List<String> temas;

	public String getNomTema() {
		return nomTema;
	}

	public void setNomTema(String nomTema) {
		this.nomTema = nomTema;
	}

	@Override
	public void addTema(Tema tema) {
		temas.add(nomTema);
	}

	@Override
	public boolean readTema(Tema tema) {
		if (temas.contains(tema.nomTema)) {
			return true;
		}
		return false;
	}

	@Override
	public List<String> listaTemas() {
		return temas;
	}

	@Override
	public void deleteTema(Tema tema) {
		temas.remove(tema.nomTema);
	}

	@Override
	public void updateTema(Tema tema1, Tema tema2) {
		temas.remove(tema1.nomTema);
		temas.add(tema2.nomTema);

	}
}
