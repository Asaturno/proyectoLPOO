package modelo;

import java.util.List;

public interface PreguntaDao {
	public void addPregunta(Pregunta pregunta);
	public boolean readPregunta(Pregunta pregunta);
	public List<String> readTotal();
	public void deletePregunta(Pregunta pregunta);
	public void updatePregunta(Pregunta pregunta1, Pregunta pregunta2);
}
