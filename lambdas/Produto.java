package lambdas;

public class Produto {
	
	final String nome;
	final double preco;
	final double desconto;
	
	/*
	 * Toda classe no java herda de Object:
	 * public class Produto{}
	 * � a mesma coisa que public class Produto extends Object{}w
	 * por isso � chamado o construtor padr�o da classe object pelo super()
	 * como isso � impl�cito, n�o precisa chama-lo
	 */
	public Produto(String nome, double preco, double desconto) {
		super(); // � desnecess�rio
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	
}
