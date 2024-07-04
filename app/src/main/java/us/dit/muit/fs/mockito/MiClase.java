package us.dit.muit.fs.mockito;

import java.util.List;
import java.util.Optional;

public class MiClase implements GestorClase {
	AlumnoDAO repositorio;

	@Override
	public void muestraAlumno(String nombre, String apellido1, String apellido2) {
		Optional<Alumno> alumno=repositorio.buscaAlumno(nombre, apellido1, apellido2);
		if (alumno.isPresent()){
			System.out.println(alumno.get());
		}
		else
			System.out.println("El alumno no está matriculado en la clase");
	}

	@Override
	public void muestraTodos(OrdenClase orden) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nuevoAlumno(String nombre, String apellido1, String apellido2) {
		Optional<Alumno> alumno=repositorio.buscaAlumno(nombre, apellido1, apellido2);
		if (alumno.isPresent()){
			System.out.println("El alumno ya estaba matriculado en la clase");
		}
		else
		{
			Alumno nuevo=new Alumno(nombre,apellido1,apellido2);
			repositorio.nuevoAlumno(nuevo);
		}
		
	}

	@Override
	public void eliminaAlumno(String nombre, String apellido1, String apellido2) {
		Optional<Alumno> alumno=repositorio.buscaAlumno(nombre, apellido1, apellido2);
		if (alumno.isPresent()){
			repositorio.eliminaAlumno(alumno.get());
		}
		else
		{
			System.out.println("El alumno no está matriculado en la clase");
		}
		
	}

	@Override
	public void nuevaNotaAlumno(String nombre, String apellido1, String apellido2, Asignaturas asignatura, double nota) {
		Optional<Alumno> alumno=repositorio.buscaAlumno(nombre, apellido1, apellido2);
		if (alumno.isPresent()){
			List<Asignatura> asignaturas=alumno.get().getAsignaturas();
			for(Asignatura asig:asignaturas) {
				if(asig.getTipo()==asignatura) {
					asig.setNota(nota);
				}
			}
			
		}
		else
		{
			System.out.println("El alumno no está matriculado en la clase");
		}
		
	}

	@Override
	public double calculaMedias() {
		List<Alumno> clase=repositorio.leeTodos();
		double media=0;
		for(Alumno alumno:clase) {
			media+=alumno.getMedia();
		}
		media=media/clase.size();
		System.out.println("La media total es "+media+" Hay "+clase.size()+" alumno");
		return media;
		
	}
	

}
