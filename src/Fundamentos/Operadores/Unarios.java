package Fundamentos.Operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.println("formula Pois Fixada");
		a++; //� o mesmo que (a = a + 1) 
		a--; //� o mesmo que (a = a - 1)
		System.out.println(a);
		
		System.out.println("Formula Pre Fixada");
		++b; //� o mesmo que (b = b+ 1) 
		--b;
		System.out.println(b);
	}

}
