package Fundamentos;



public class Tem {
	public static void main(String[] args) {
		// ( f -32 * 5/9 = C)
		
		double fahrenheit = 180;
		final double FATOR = 32;
		final double AJUSTE = 5.0/9.0;
		
		double celsius = (fahrenheit -FATOR)* AJUSTE;
		System.out.println(" A temperatura é " + celsius);
		
		fahrenheit = 300;
		
		celsius = (fahrenheit - AJUSTE)* FATOR;
		System.out.println(" A temperatura é " + celsius);
	}

}
