package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){// Construtor Padr�o
		
	}
	
	//Construtor Exprisito
	Produto(String nomeInicial, Double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
		
	}
	
	double PrecoComDesconto() {
		return preco * (1-desconto);
	}

}
