package util.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import util.DateUtil;

public class DateUtilTest {

	//acá se define el lote de pruebas
	Date fechaCumple;
	
	//@Notations 
	//es una marca
	
	@Before
	public void setUp() throws Exception {
		//se ejecuta antes de cada prueba
		Calendar cal = Calendar.getInstance();
		cal.set(1972,  Calendar.NOVEMBER, 17);
		fechaCumple = cal.getTime();
	}

	@After
	public void tearDown() throws Exception {
		//se ejecuta después de cada prueba, garantiza un lote limpio
		fechaCumple = null;
	}

	
	@Test
	public void testGetAnio() {
		assertEquals(1972, DateUtil.getAnio(fechaCumple));
	}

	@Test
	public void testGetMes() {
		assertEquals(11, DateUtil.getMes(fechaCumple));
	}

	@Test
	public void testGetDia() {
		assertEquals(17, DateUtil.getDia(fechaCumple));
	}

	//@Test
	//public void testGetDiaDeSemana() {
	//	assertEquals(6, DateUtil.getDiaDeSemana(fechaCumple));
	//}
}


