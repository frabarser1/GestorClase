package us.dit.muit.fs.mockito;

import java.util.List;
import java.util.Optional;

public interface AlumnoDAO {
	/**
	 * Devuelve todos los alumnos de la clase
	 * @return
	 */
	List<Alumno> leeTodos();
	/**
	 * Introduce un nuevo alumno en la clase
	 * @param alumno
	 */
	void nuevoAlumno(Alumno alumno);
	/**
	 * Elimina un alumno de la clase
	 * @param alumno
	 */
	void eliminaAlumno(Alumno alumno);
	/**
	 * Cambia los datos de un alumno que ya pertenece a la clase
	 * @param alumno
	 */
	void actualizaAlumno(Alumno alumno);
	
	/**
	 * Busca y devuelve un alumno por sus datos personales, si lo encuentra
	 * @param name
	 * @param apellido1
	 * @param apellido2
	 * @return
	 */
	Optional<Alumno> buscaAlumno(String name,String apellido1,String apellido2);
}
