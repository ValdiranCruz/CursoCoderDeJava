package Fundamentos;



public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal " .charAt(10));
		String s = "Boa tarde";
		System.out.println(s.concat(" !!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		
		// muda de maiuscula para minuscula "toLowerCase"
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		// Quanto caracteres tem uma palavara
		System.out.println(s.length());
		
		// Compração de igualdade é o "equals"
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobreNome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f ", nome,
				sobreNome, idade, salario );
		
		String frase = String.format(" \n O senhor %s %s tem %d anos e ganha R$ %.2f ", nome,
				sobreNome, idade, salario );
		System.out.println(frase);
		
		
	}

}
