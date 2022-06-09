package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pregunta implements PreguntaDao{
	private String pregunta;
	private String respuesta;
	private Categoria categoria;
	private ArrayList<Tema> temas;
	private List<String> preguntas;
	private List<String> respuestas;
	
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
		preguntas.add(pregunta.pregunta);
		respuestas.add(pregunta.respuesta);
	}
	@Override
	public boolean readPregunta(Pregunta pregunta) {
		if(preguntas.contains(pregunta.pregunta)) {
			return true;
		}
		return false;
	}
	@Override
	public void deletePregunta(Pregunta pregunta) {
		preguntas.remove(pregunta.pregunta);
	}
	@Override
	public void updatePregunta(Pregunta pregunta1, Pregunta pregunta2) {
		preguntas.remove(pregunta1.pregunta);
		preguntas.add(pregunta2.pregunta);
	}
	@Override
	public List<String> totalPreguntas() {
		return preguntas;
	}
	@Override
	public List<String> totalRespuestas() {
		return respuestas;
	}
}
