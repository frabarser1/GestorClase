package us.dit.muit.fs.mockito;

import java.util.ArrayList;
import java.util.List;
/**
 * Notas de un alumno en una asignatura
 */
public class Asignatura {
	public Asignatura(Asignaturas tipo) {
		super();
		this.tipo = tipo;
		this.notas=new ArrayList<Double>();
	}
	Asignaturas tipo;
	List<Double> notas;
	Double media;
	
	public Asignaturas getTipo() {
		return tipo;
	}
	
	public List<Double> getNotas() {
		return notas;
	}
	
	public void setNota(double nota) {
		notas.add(nota);
	}
	public Double getMedia() {
		setMedia();
		return media;
	}
	public void setMedia() {
		double media=0;
		for(Double nota:notas) {
			media+=nota;
		}
		media=media/notas.size();
		this.media = media;
	}
	
	@Override
	public String toString() {
		setMedia();
		String asignatura="Nombre: "+tipo.toString()+"/n Listado de notas: "+notas.toString()+"/n Media: "+media+"/n";		
		return asignatura;
	}
}
