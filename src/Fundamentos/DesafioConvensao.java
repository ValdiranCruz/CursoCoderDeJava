package Fundamentos;

import java.util.Scanner;

public class DesafioConvensao {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o primeiro sal�rio");
		String valor1 = input.next().replace(",", ". ");

		System.out.print("Informe o segundo sal�rio");
		String valor2 = input.next().replace(",", ". ");

		System.out.print("Informe o terceiro sal�rio");
		String valor3 = input.next().replace(",", ". ");

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) /3;
		System.out.println(" A m�dia �: " + media);

		input.close();
	}

}
