/**
 * 
 */
package us.dit.muit.fs.mockito;

import java.util.List;

/**
 * Datos de un alumno
 */
public class Alumno{
	public Alumno(String nombre, String apellido1, String apellido2) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	String nombre;
	String apellido1;
	String apellido2;
	List<Asignatura> asignaturas;
	double media;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	public double getMedia() {
		setMedia();
		return media;
	}
	public void setMedia() {
		double media=0;
		for(Asignatura asignatura:asignaturas) {
			media+=asignatura.getMedia();
		}
		media=media/asignaturas.size();
		this.media = media;
	}
	
	@Override
	public String toString() {
		String notas="";
		for(Asignatura asignatura:asignaturas) {
			notas=notas+asignatura.toString()+"/n";
		}
		String alumno="Nombre: "+nombre+" "+apellido1+" "+apellido2+"/n Notas:";
		return alumno;
	}
}
