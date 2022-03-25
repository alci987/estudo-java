package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	/*
	 * Na herança, não precisa instanciar a classe herdada pois não é composição
	 * basta chamar os atributos herdadas. ex: formade falar em vez de mae.formaDeFalar
	 */
	//Ana mae = new Ana(); não precisa
	
	void testeAcessos() {
		//System.out.println(mae.segredo); // não pode acessar
		//System.out.println(mae.façoDendeDeCasa); atributo default - só recebe por herança se estiver no mesmo pacote
		System.out.println(formaDeFalar); // atributo herdado
		System.out.println(todosSabem); // atributo público
		System.out.println(new Ana().todosSabem); // outra forma de instanciar
	}


}
