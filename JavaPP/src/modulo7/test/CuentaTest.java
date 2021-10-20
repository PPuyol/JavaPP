package modulo7.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
//doble click pone los breakpoints

import modulo7.CajaDeAhorro;
import modulo7.Cuenta;
import modulo7.CuentaCorriente;

public class CuentaTest {
	//lote de pruebas
	
	Cuenta cajaDeAhorroVacia;
	Cuenta cuentaCorrientellena;
	List<Cuenta> lstCuentas; //es un tipo de coleccion ordered (uno atràs de la otra)
	Set<Cuenta> setCuentas; //no permite duplicados
	
	@Before
	public void setUp() throws Exception {
		//cuentaVacia = new Cuenta();
		//cuentaLlena = new Cuenta(10,100);
		//cuando pasa a ser abstracto dejo de crear Cuenta y defino cajaDeAhorro;
		cajaDeAhorroVacia = new CajaDeAhorro();
		cuentaCorrientellena = new CuentaCorriente(10,100,2500);
	
		//lista tipo List
		lstCuentas = new ArrayList<>();
		lstCuentas.add(new CajaDeAhorro(10, 100, 1.5f));
		lstCuentas.add(new CajaDeAhorro(20, 200, 2.5f));
		lstCuentas.add(new CajaDeAhorro(30, 300, 3.5f));
		lstCuentas.add(new CajaDeAhorro(40, 400, 4.5f));
		lstCuentas.add(new CajaDeAhorro(50, 500, 5.5f));
		lstCuentas.add(new CajaDeAhorro());
		
		lstCuentas.add(new CuentaCorriente(60, 600, 6000));
		lstCuentas.add(new CuentaCorriente(70, 700, 7000));
		lstCuentas.add(new CuentaCorriente(80, 800, 8000));
		lstCuentas.add(new CuentaCorriente(90, 900, 9000));
		lstCuentas.add(new CuentaCorriente(100, 1000, 10000));
		lstCuentas.add(new CuentaCorriente());
	
		//lista tipo Set
		setCuentas = new HashSet<>();
		setCuentas.add(new CajaDeAhorro(10, 100, 1.5f));
		setCuentas.add(new CajaDeAhorro(20, 200, 2.5f));
		setCuentas.add(new CajaDeAhorro(30, 300, 3.5f));
		setCuentas.add(new CajaDeAhorro(40, 400, 4.5f));
		setCuentas.add(new CajaDeAhorro(50, 500, 5.5f));
		setCuentas.add(new CajaDeAhorro());
		
		setCuentas.add(new CuentaCorriente(60, 600, 6000));
		setCuentas.add(new CuentaCorriente(70, 700, 7000));
		setCuentas.add(new CuentaCorriente(80, 800, 8000));
		setCuentas.add(new CuentaCorriente(90, 900, 9000));
		setCuentas.add(new CuentaCorriente(100, 1000, 10000));
		setCuentas.add(new CuentaCorriente());
	
	}
	
	@After
	public void tearDown() throws Exception {
		cajaDeAhorroVacia = null;
		cuentaCorrientellena = null;
		lstCuentas = null;
		setCuentas = null;
	}

	@Test
	public void testEqualenList_True() {
		assertTrue(lstCuentas.contains(cajaDeAhorroVacia));
	}
	@Test
	public void testEqualenList_False() {
		cajaDeAhorroVacia.setNumero(12);
		assertFalse(lstCuentas.contains(cajaDeAhorroVacia));
	}
	@Test
	public void testEqualenSet_True() {
		cajaDeAhorroVacia.setNumero(12);
		assertTrue(setCuentas.add(cajaDeAhorroVacia)); //si es diferente la agrega 
		System.out.println("lista " + lstCuentas);
		System.out.println("\nset " + setCuentas);
	}
	@Test
	public void testEqualenSet_False() {
		assertFalse(setCuentas.add(cajaDeAhorroVacia)); //no deja agregarlo
		System.out.println("lista " + lstCuentas);
		System.out.println("\nset " + setCuentas);
	}
	
	
	@Test
	public void testCuenta() {
		assertEquals(0, cajaDeAhorroVacia.getNumero());
		assertEquals(0, cajaDeAhorroVacia.getSaldo(),0.01);
	}

	@Test
	public void testCuentaIntFloat() {
		assertEquals(10, cuentaCorrientellena.getNumero());
		assertEquals(100, cuentaCorrientellena.getSaldo(),0.01);
	}

	@Test
	public void testAcreditarCuentaVacia() {
		cajaDeAhorroVacia.acreditar(5);
		assertEquals(5, cajaDeAhorroVacia.getSaldo(),0.01);
	}
	
	@Test
	public void testAcreditarCuentaLlena() {
		cuentaCorrientellena.acreditar(5);
		assertEquals(105, cuentaCorrientellena.getSaldo(),0.01);
	}

	@Test
	public void testDebitarCuentaLlena() {
		cuentaCorrientellena.debitar(20);
		assertEquals(80, cuentaCorrientellena.getSaldo(),0.01);
	}
	
	@Test
	public void testDebitarCuentaLlena_fallido() {
		cuentaCorrientellena.debitar(20);
		assertEquals(80, cuentaCorrientellena.getSaldo(),0.01);
	}

	//testeo del boolean
	@Test
	public void testEqualsCajaDeAhorro() {
		CajaDeAhorro nuevaCaja = new CajaDeAhorro();
		assertTrue(cajaDeAhorroVacia.equals(nuevaCaja));
	}
	@Test
	public void testEqualsCajaDeAhorro_false() {
		CajaDeAhorro nuevaCaja = new CajaDeAhorro();
		nuevaCaja.setInteres(2.3f);
		System.out.println("nueva caja=" + nuevaCaja);
		assertFalse(cajaDeAhorroVacia.equals(nuevaCaja));
	}
	@Test
	public void testEqualsCajaDeAhorro_true() {
		CajaDeAhorro nuevaCaja = new CajaDeAhorro();
		System.out.println("nueva caja=" + nuevaCaja);
		assertTrue(cajaDeAhorroVacia.equals(nuevaCaja));
	}

	
}

