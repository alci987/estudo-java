package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criando uma instancia de produto
		Produto p1 = new Produto( "Notebook", 4356.89);
		//p1.nome = "Notebook"; já está sendo passado no construtor
		//p1.preco = 4356.89; já está sendo passado no construtor
		//p1.desconto = 0.25; já está sendo passado no construtor
		 
		var p2 = new Produto(); // chama o construtor padrão
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Produto.desconto = 0.50; // 29% de desconto
		
		double produtoFinal1 = p1.precoComDesconto();
		double produtoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (produtoFinal1 + produtoFinal2) / 2;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p1.preco);
		
		System.out.println(produtoFinal1);
		
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		System.out.println(produtoFinal2);
		
		System.out.printf("Média do carrinho: R$%.2f", mediaCarrinho);

	}

}
