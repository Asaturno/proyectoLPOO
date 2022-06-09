package modelo;

import java.util.List;

public class Tema implements TemasDao{
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
		for(int i=0; i<temas.size(); i++) {
			if(tema.nomTema.equals(tema)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Tema> listaTemas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTema(Tema tema) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTema(Tema tema1, Tema tema2) {
		// TODO Auto-generated method stub
		
	}
}
