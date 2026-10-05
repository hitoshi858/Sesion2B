package Sesion2B;

public class Empleado 
{
	
	public static enum TipoEmpleado 
	{
		vendedor,
		encargado
		
	}
	
	 float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) 
	 {
		 float salarioB;
		if(tipo==TipoEmpleado.vendedor)
		{
			salarioB=2000;
		}
		else
		{
			salarioB=2500;
		}
		
		
		
		if(ventasMes>1500)
		{
			salarioB=salarioB+200;
		}
		else if(ventasMes>1000)
		{
			salarioB=salarioB+100;
		}
		else 
		{
			salarioB=salarioB;
		}
		
		if(horasExtra!=0)
		{
			salarioB=salarioB+(horasExtra*30);
		}
		
		return salarioB;
		
		
	 } 

}
