package Fundamentos;


public class Temperatura {
	public static void main(String[] args) {
		// (º F -32 ) * 5/9 = C
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32; 
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(" O resultado é " +  celsius + "°C ");
		
		fahrenheit = 7;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(" O resultado é " +  celsius + "°C ");
		
		fahrenheit = 45;
		celsius = (fahrenheit - AJUSTE)* FATOR;
		System.out.println( " O resultado é " + celsius + " °C");
		
		fahrenheit = 100;
		celsius = ( fahrenheit - AJUSTE )* FATOR;
		 System.out.println(" O resultado é " + celsius + "°C");
		 
		 fahrenheit = 250;
		 celsius=(fahrenheit - AJUSTE) * FATOR;
		 System.out.println(" O resultado é " + celsius + "°C");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
	}
}
