package Fundamentos;

public class ConvensaoTipoPrimitivoNumerico {
	public static void main(String[] args) {

		double a = 1; // conven��o impl�cita(n�o problemas)
		System.out.println(a);

		float b = (float) 1.0123456; // conven��o explicita (CAST) pode ocorre perda de informa��es
		System.out.println(b);

		int c = 4;
		byte d = (byte) c; // conven��o explicita (CAST) pode ocorre perda de informa��es

		System.out.println(d);

		double e = 1.0;
		byte f = (byte) e; // conven��o explicita (CAST) pode ocorre perda de informa��es

		System.out.println(f);
	}

}
