package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 4.5, 3);
		compra1.adicionarItem(new Produto("Caderno", 18.95), 20);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Notebook", 1844.5, 3);
		compra2.adicionarItem(new Produto("Bolsa escolar", 188.95), 16);
		
		Cliente cliente = new Cliente("Alciliano");
		cliente.compras.add(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obterValorTotal());

	}

}
