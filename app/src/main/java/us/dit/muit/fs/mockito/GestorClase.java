package us.dit.muit.fs.mockito;

public interface GestorClase {
	/**
	 * Muestra los datos de un alumno determinado
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 */
	void muestraAlumno(String nombre,String apellido1,String apellido2);
	/**
	 * Muestra todos los alumnos ordenados por el criterio pasado como parámetro
	 * @param orden
	 */
	void muestraTodos(OrdenClase orden);
	void nuevoAlumno(String nombre,String apellido1,String apellido2);
	/**
	 * Elimina a un alumno de la clase
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 */
	void eliminaAlumno(String nombre,String apellido1,String apellido2);
	/**
	 * Añade una nueva nota de una asignatura a un alumno
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param asignatura
	 * @param nota
	 */
	void nuevaNotaAlumno(String nombre,String apellido1,String apellido2,Asignaturas asignatura,double nota);
	/**
	 * Realiza el cálculo de las medias de todos los alumnos, en todas las asignaturas
	 * Devuelve la media total de notas de la clase
	 * @return
	 */
	double calculaMedias();
}
