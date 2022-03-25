package oo.composicao;

import java.util.ArrayList;

public class Compra { // Rela��o 1 - n (1 pra muitos)
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	// devido a rela��o bidirecional, foi preciso criar o m�todo adicionarItem
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
		
	}
	
	// calculando o valor total da compra
	double getValorTotal() {
		double total = 0; // vari�vel acumuladora
		
		// percorrendo os itens para obter os valores de cada item
		for(Item iten: itens) {
			total += iten.quantidade * iten.preco;
		}
		
		return total;
	}
	

}
