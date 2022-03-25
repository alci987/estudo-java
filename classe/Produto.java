package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	// criando um construtor
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	// construtor padrão feito explicitamente
	Produto() {
		
	}
	double precoComDesconto() {
		
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		
		return preco * (1 - desconto + descontoDoGerente);
	}
}
