package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();

	void testeAcessos() {
		//System.out.println(sogra.segredo); // não pode acessar
		//System.out.println(sogra.façoDendeDeCasa); atributo default - só recebe por herança se estiver no mesmo pacote
		System.out.println(sogra); // atributo herdado
		System.out.println(sogra.todosSabem); // atributo público
		//System.out.println(new Ana().todosSabem); // outra forma de instanciar
	}
}
