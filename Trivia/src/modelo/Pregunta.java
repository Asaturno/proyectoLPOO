package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pregunta implements PreguntaDao{
	private String pregunta;
	private String respuesta;
	private Categoria categoria;
	private ArrayList<Tema> temas;
	
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public void hasTema(Tema tema) {
		
	}
	@Override
	public void addPregunta(Pregunta pregunta) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean readPregunta(Pregunta pregunta) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<Pregunta> readTotal() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deletePregunta(Pregunta pregunta) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updatePregunta(Pregunta pregunta1, Pregunta pregunta2) {
		// TODO Auto-generated method stub
		
	}
}
