package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra compra1 = new Compra();
		compra1.cliente = "Alciliano";
		
		// adicionando elementos na lista
		compra1.adicionarItem(new Item("Camisa", 5, 45.00)); // usando o método criado
		compra1.itens.add(new Item("Caneta", 1, 5.00));
		compra1.itens.add(new Item("Caderno", 3, 35.00));
		
		// pegand o tamanho da compra do cliente
		System.out.println("Seu carrinho de compras tem: " + compra1.itens.size() + " itens");
		
		// mostrando o valor total dos itens
		System.out.println("Você tem de pagar: R$" + compra1.getValorTotal());

	}

}
