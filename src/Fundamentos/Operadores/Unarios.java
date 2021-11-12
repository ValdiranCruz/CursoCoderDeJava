package Fundamentos.Operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.println("formula Pois Fixada");
		a++; //É o mesmo que (a = a + 1) 
		a--; //É o mesmo que (a = a - 1)
		System.out.println(a);
		
		System.out.println("Formula Pre Fixada");
		++b; //É o mesmo que (b = b+ 1) 
		--b;
		System.out.println(b);
	}

}
