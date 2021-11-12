package Fundamentos;

public class ConvensaoTipoPrimitivoNumerico {
	public static void main(String[] args) {

		double a = 1; // convenção implícita(não problemas)
		System.out.println(a);

		float b = (float) 1.0123456; // convenção explicita (CAST) pode ocorre perda de informações
		System.out.println(b);

		int c = 4;
		byte d = (byte) c; // convenção explicita (CAST) pode ocorre perda de informações

		System.out.println(d);

		double e = 1.0;
		byte f = (byte) e; // convenção explicita (CAST) pode ocorre perda de informações

		System.out.println(f);
	}

}
