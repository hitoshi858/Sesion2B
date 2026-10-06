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

	// ========================================================
	// CÁLCULO NÓMINA BRUTA CON VENDEDOR
	// ========================================================

	@Test
	void testNominaBrutaVendedormasde1500nohe() {
		//Vendedor, mas de 1500, sin horas extra
		assertEquals(2200, e.calculoNominaBruta(TipoEmpleado.vendedor, 1600, 0));
	}

	@Test
	void testNominaBrutaVendedormenosde1500nohe() {
		//Vendedor, entre 1000 y 1500, sin horas extra
		assertEquals(2100, e.calculoNominaBruta(TipoEmpleado.vendedor, 1400, 0));
	}

	@Test
	void testNominaBrutaVendedormenosde1000nohe() {
		//Vendedor, menos de 1000, sin horas extras
		assertEquals(2000, e.calculoNominaBruta(TipoEmpleado.vendedor, 100, 0));
	}

	@Test
	void testNominaBrutaVendedormasde1500he() {
		//Vendedor, mas de 1500, con 1 hora extra
		assertEquals(2230, e.calculoNominaBruta(TipoEmpleado.vendedor, 1600, 1));
	}

	@Test
	void testNominaBrutaVendedormenosde1500he() {
		//Vendedor, entre 1000 y 1500, con 1 hora extra
		assertEquals(2130, e.calculoNominaBruta(TipoEmpleado.vendedor, 1400, 1));
	}

	@Test
	void testNominaBrutaVendedormenosde1000he() {
		//Vendedor, menos de 1000, con 1 hora extra
		assertEquals(2030, e.calculoNominaBruta(TipoEmpleado.vendedor, 100, 1));
	}

	// ========================================================
	// CÁLCULO NÓMINA BRUTA CON ENCARGADO
	// ========================================================

	@Test
	void testNominaBrutaEncargadomasde1500nohe() {
		//Encargado, mas de 1500, sin horas extra
		assertEquals(2700, e.calculoNominaBruta(TipoEmpleado.encargado, 1600, 0));
	}

	@Test
	void testNominaBrutaEncargadomenosde1500nohe() {
		//Encargado, entre 1000 y 1500, sin horas extra
		assertEquals(2600, e.calculoNominaBruta(TipoEmpleado.encargado, 1400, 0));
	}

	@Test
	void testNominaBrutaEncargadomenosde1000nohe() {
		//Encargado, menos de 1000, sin horas extra
		assertEquals(2500, e.calculoNominaBruta(TipoEmpleado.encargado, 100, 0));
	}

	@Test
	void testNominaBrutaEncargadomasde1500he() {
		//Encargado, mas de 1500, con 1 hora extra
		assertEquals(2730, e.calculoNominaBruta(TipoEmpleado.encargado, 1600, 1));
	}

	@Test
	void testNominaBrutaEncargadomenosde1500he() {
		//Encargado, entre 1000 y 1500, con 1 hora extra
		assertEquals(2630, e.calculoNominaBruta(TipoEmpleado.encargado, 1400, 1));
	}

	@Test
	void testNominaBrutaEncargadomenosde1000he() {
		//Encargado, menos de 1000, con 1 hora extra
		assertEquals(2530, e.calculoNominaBruta(TipoEmpleado.encargado, 100, 1));
	}

	// ========================================================
	// VALORES LÍMITE PENDIENTES
	// ========================================================

	@Test
	void testNominaBrutaVendedorLimite1000() {
		//Vendedor, exactamente 1000 de ventas, sin horas extra
		assertEquals(2100, e.calculoNominaBruta(TipoEmpleado.vendedor, 1000, 0));
	}

	@Test
	void testNominaBrutaVendedorLimite1500() {
		//Vendedor, exactamente 1500 de ventas, sin horas extra
		assertEquals(2200, e.calculoNominaBruta(TipoEmpleado.vendedor, 1500, 0));
	}

	// ========================================================
	// PRUEBAS PARA CÁLCULO NÓMINA NETA
	// ========================================================

	@Test
	void testNominaNetaSinRetencion() {
		//Nomina bruta menos de 2100, sin retencion
		assertEquals(2000, e.calculoNominaNeta(2000));
	}

	@Test
	void testNominaNetaSinRetencionLimite() {
		//Nomina bruta exactamente 2100, sin retencion
		assertEquals(2100, e.calculoNominaNeta(2100));
	}

	@Test
	void testNominaNetaRetencion15() {
		//Nomina bruta entre 2100 y 2500, retencion del 15%
		assertEquals(1870, e.calculoNominaNeta(2200));
	}

	@Test
	void testNominaNetaRetencion18() {
		//Nomina bruta de 2500 o mas, retencion del 18%
		assertEquals(2050, e.calculoNominaNeta(2500));
	}
}