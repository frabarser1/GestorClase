/**
 * 
 */
package us.dit.muit.fs.mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import java.util.List;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMostOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import us.dit.muit.fs.mockito.AlumnoDAO;
import org.mockito.Mock;
import org.mockito.Mockito;
import us.dit.muit.fs.mockito.Alumno;

/**
 * 
 */
class VerificaMiClase {
	private static AlumnoDAO alumnoDAO;
	private static List<Alumno> alumnos = new ArrayList<Alumno>();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Alumno alumnonuevo = new Alumno("Fran", "Barrero", "Serrano");
		alumnos.add(alumnonuevo);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link us.dit.muit.fs.mockito.MiClase#muestraAlumno(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	void testMuestraAlumno() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link us.dit.muit.fs.mockito.MiClase#muestraTodos(us.dit.muit.fs.mockito.OrdenClase)}.
	 */
	@Test
	void testMuestraTodos() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link us.dit.muit.fs.mockito.MiClase#nuevoAlumno(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	void testNuevoAlumno() {
		alumnoDAO = Mockito.mock(AlumnoDAO.class);

		//Escribir verificaciones


	}

	/**
	 * Test method for {@link us.dit.muit.fs.mockito.MiClase#eliminaAlumno(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	void testEliminaAlumno() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link us.dit.muit.fs.mockito.MiClase#nuevaNotaAlumno(java.lang.String, java.lang.String, java.lang.String, us.dit.muit.fs.mockito.Asignaturas, double)}.
	 */
	@Test
	void testNuevaNotaAlumno() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link us.dit.muit.fs.mockito.MiClase#calculaMedias()}.
	 */
	@Test
	void testCalculaMedias() {
		fail("Not yet implemented");
	}

}
