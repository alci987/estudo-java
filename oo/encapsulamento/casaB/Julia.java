package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();

	void testeAcessos() {
		//System.out.println(sogra.segredo); // n�o pode acessar
		//System.out.println(sogra.fa�oDendeDeCasa); atributo default - s� recebe por heran�a se estiver no mesmo pacote
		System.out.println(sogra); // atributo herdado
		System.out.println(sogra.todosSabem); // atributo p�blico
		//System.out.println(new Ana().todosSabem); // outra forma de instanciar
	}
}
