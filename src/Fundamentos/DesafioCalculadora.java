package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("finforme o primeiro n�mero");
		double n1 = input.nextDouble();

		System.out.println("finforme o segundo n�mero");
		double n2 = input.nextDouble();

		System.out.println("finforme a opera��o");
		String op = input.next();
		
		//L�gica
		double resultado = "+".equals(op) ? n1 + n2 : 0;
		 resultado = "-".equals(op) ? n1 - n2 : resultado;
		 resultado = "*".equals(op) ? n1 * n2 : resultado;
		 resultado = "/".equals(op) ? n1 / n2 : resultado;
		 resultado = "%".equals(op) ? n1 % n2 : resultado;
		 
		System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resultado);
		input.close();
	}
}
