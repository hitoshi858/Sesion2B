package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sesion2B.Empleado;
import Sesion2B.Empleado.TipoEmpleado;

class EmpleadoTest {

	Empleado e = new Empleado();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNominaBrutaVendedormasde1500nohe() {
		assertEquals(2200, e.calculoNominaBruta(TipoEmpleado.vendedor, 1600, 0));
	}
	
	void testNominaBrutaVendedormenosde1500nohe() {
		assertEquals(2200, e.calculoNominaBruta(TipoEmpleado.vendedor, 1400, 0));
	}
	
	void testNominaBrutaVendedormenosde1000nohe() {
		assertEquals(2200, e.calculoNominaBruta(TipoEmpleado.vendedor, 100, 0));
	}
	
	@Test
	void testNBE1500nhe() {
		assertEquals(2200, e.calculoNominaBruta(TipoEmpleado.encargado, 1600, 0));
	}@Test
	void testNB() {
		fail("Not yet implemented");
	}@Test
	void test() {
		fail("Not yet implemented");
	}@Test
	void test() {
		fail("Not yet implemented");
	}@Test
	void test() {
		fail("Not yet implemented");
	}@Test
	void test() {
		fail("Not yet implemented");
	}

}
