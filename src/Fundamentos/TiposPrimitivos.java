package Fundamentos;



public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es de um funcionario
		
		// Tipos n�mericos
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados= 3_134_845_223L;
		
		// Tipos de n�meros com casa flutuantes
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos booleanos
		
		boolean estaDeFerias = false; // Ou true
		
		// Tipo Caradtere
		char status = 'A'; // apenas um caracter se for mais de um caracter tem que ser " aspras duplas"
		
		// Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�meros de Viagem
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println( id + " ganha -> " + salario);
		
		System.out.println( " f�rias ? " + estaDeFerias);
		
		System.out.println( "Status " + status);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
