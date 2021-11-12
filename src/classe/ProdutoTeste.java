package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto("NoteBook ", 4356.89);// Construtor Expristo

		var p2 = new Produto();// construtor Padrão
		p2.nome = "Caneta Preta ";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;

		System.out.println(p1.nome + "" + p1.PrecoComDesconto());
		System.out.println(p2.nome + "" + p2.PrecoComDesconto());

		double PrecoFinal = p1.PrecoComDesconto();
		double PrecoFinal2 = p2.PrecoComDesconto();
		double mediaCarrinho = (PrecoFinal + PrecoFinal2) / 2;

		System.out.printf(" A média do compra é = R$%.2f.", mediaCarrinho);

	}

}
