package Sesion2B;

public class Empleado {

	public static enum TipoEmpleado {
		vendedor, encargado

	}

	 public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float salarioB;
		if (tipo == TipoEmpleado.vendedor) {
			salarioB = 2000;
		} else {
			salarioB = 2500;
		}

		if (ventasMes >= 1500) {
			salarioB = salarioB + 200;
		} else if (ventasMes >= 1000) {
			salarioB = salarioB + 100;
		} 

		if (horasExtra != 0) {
			salarioB = salarioB + (horasExtra * 30);
		}

		return salarioB;

	}

	public float calculoNominaNeta(float nominaBruta) {
		 if(nominaBruta>=2100)
		 {
			 if(nominaBruta>=2500)
			 {
				 return nominaBruta*(1-18);
			 }
			 else
				 return nominaBruta*(1-15);
		 }
		 else
			 return nominaBruta;
		 
	 }
	
}
