package classe;

import java.util.Scanner;

public class NotaTeste {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	NotaAluno n1 = new NotaAluno();
	System.out.println("Informe a nota");
	n1.Historia = input.nextDouble();
	System.out.println("Informe a nota");
	n1.portugues = input.nextDouble();
	System.out.println("Informe a nota");
	n1.matematica = input.nextDouble();
	double media = 0;
	
	 
	
	if (media > 7.5 && media ==10) {
		System.out.println("Aluno aprovado");
		
	}else if (media < 7.5 && media > 6.0) {
		System.out.println("Fazer prova substitutiva ");
		
	}else if (media < 6.0 && media ==0) {
		System.out.println(" Inflismente você está Reprovado");
	}
	media = (n1.Historia + n1.matematica+n1.portugues) /2;
	System.out.println(media);
	
	

	input.close();
	
	
}
}
