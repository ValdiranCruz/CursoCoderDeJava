package EstruturaDeControle;

import java.util.Scanner;

// while e mais recomendado quando N�O sabe a quntidade de Repeti��es 
public class While_Indetreminado {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String valor = "";
		
		while (!valor.equalsIgnoreCase("Sair")) {
			System.out.print("Voc� diz: ");
			valor = input.nextLine();
		}
		System.out.println("Fim do programa !!!");
		input.close();
	}
	

}
