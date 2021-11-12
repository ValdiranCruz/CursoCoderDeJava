package Fundamentos.Operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// trabalho na trça (v ou F)
		// trabalho na quinta (v ou F)

		boolean trabalho1 = false;
		boolean trabalho2 = true;
		boolean sorvete = trabalho1 || trabalho2;
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;

		// Operador unário
		boolean maisSaudavel = !sorvete;
		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("Comprou TV 32\"?" + comprouTV32);
		System.out.println("Comprou sorvete\"?" + sorvete);

		System.out.println("\nComprou sorvete\"?" + maisSaudavel);

	}

}
