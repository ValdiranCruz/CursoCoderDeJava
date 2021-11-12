package Fundamentos.Operadores;

public class OperadoresLogicos_01 {
	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2); // Ou (||) Exclusivo!
		System.out.println(!condicao1);
		System.out.println(!condicao2);

		System.out.println("Tabela Verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		// System.out.println(false && true);
		// System.out.println(false && false);

		System.out.println("\n Tabela verdade do OU (OR)");
		// System.out.println(true || true);
		// System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("\n Tabela Verdade Ou Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\n Tabela Verdade NOT");
		System.out.println(!true );
		System.out.println(!true );
		System.out.println(!!true );
		System.out.println(!!false );
		

	}
}
