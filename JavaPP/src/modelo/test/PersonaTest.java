package modelo.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.Alumno;
import modelo.Persona;
import modelo.Profesor;

public class PersonaTest {

	//lote de prueba
	Persona personaA;
	Persona personaP;
	List<Persona> lstAlumnos;
	List<Persona> lstProfesores;
	
	@Before
	public void setUp() throws Exception {
		personaA = new Alumno("Martin", "Arroyo", 5);
		personaP = new Profesor("Roberto", "García", "LGAR95");
		
		lstAlumnos = new ArrayList<>();
		lstAlumnos.add(new Alumno("Martin", "Arroyo",     05));
		lstAlumnos.add(new Alumno("Juana", "Beli",        15));
		lstAlumnos.add(new Alumno("Lucía", "Alvarez",     25));
		lstAlumnos.add(new Alumno("Ana", "Roma",          35));
		lstAlumnos.add(new Alumno("Benicio", "Zabala",    45));
		lstAlumnos.add(new Alumno("Agunstín", "Martínez", 55));

		lstProfesores = new ArrayList<>();
		lstProfesores.add(new Profesor("Roberto", "García", "LGAR95"));
		lstProfesores.add(new Profesor("Juan", "Alvarez"  , "LGAR80"));
		lstProfesores.add(new Profesor("Soledad", "Acuña" , "LGAR25"));
	}
		
	@After
	public void tearDown() throws Exception {
		personaA = null;
		lstAlumnos = null;
	}

	@Test
	public void testPersona() {
		assertEquals("Martin", personaA.getNombre());
		assertEquals("Arroyo", personaA.getApellido());
		assertEquals("Roberto", personaP.getNombre());
		assertEquals("García", personaP.getApellido());
	}

	@Test
	public void testEqualenList_True() {
		assertTrue(lstAlumnos.contains(personaA));
		System.out.println("Lista de Alumnos");
		for (int i =0;i<lstAlumnos.size();i++)
			System.out.println("\nAlumno: " + lstAlumnos.get(i));
			}

	@Test
	public void testEqualenListP_True() {
		assertTrue(lstProfesores.contains(personaP));
		System.out.println("Lista de Profesoress");
		for (int i =0;i<lstProfesores.size();i++)
			System.out.println("\nProfesor: " + lstProfesores.get(i));
			}
}
