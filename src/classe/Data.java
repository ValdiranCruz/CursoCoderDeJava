package classe;

public class Data {
	int dia = 0;
	int mes = 0;
	int ano = 0;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
		
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}
	

}
