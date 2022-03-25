package lambdas;

public class Produto {
	
	final String nome;
	final double preco;
	final double desconto;
	
	/*
	 * Toda classe no java herda de Object:
	 * public class Produto{}
	 * é a mesma coisa que public class Produto extends Object{}w
	 * por isso é chamado o construtor padrão da classe object pelo super()
	 * como isso é implícito, não precisa chama-lo
	 */
	public Produto(String nome, double preco, double desconto) {
		super(); // é desnecessário
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	
}
