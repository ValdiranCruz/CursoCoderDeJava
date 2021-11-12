package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print(" dia \n");

		Scanner input = new Scanner(System.in);

		System.out.print("digite o seu nome: ");
		String nome = input.nextLine();

		System.out.print("digite o seu sobrenome: ");
		String sobreNome = input.nextLine();

		System.out.print("digite a sua idade: ");
		int idade = input.nextInt();

		System.out.printf("%s %s tem %d anos.%n ", nome, sobreNome, idade);

		input.close();
	}

}
