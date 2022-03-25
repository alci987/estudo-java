package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	/*
	 * Na heran�a, n�o precisa instanciar a classe herdada pois n�o � composi��o
	 * basta chamar os atributos herdadas. ex: formade falar em vez de mae.formaDeFalar
	 */
	//Ana mae = new Ana(); n�o precisa
	
	void testeAcessos() {
		//System.out.println(mae.segredo); // n�o pode acessar
		//System.out.println(mae.fa�oDendeDeCasa); atributo default - s� recebe por heran�a se estiver no mesmo pacote
		System.out.println(formaDeFalar); // atributo herdado
		System.out.println(todosSabem); // atributo p�blico
		System.out.println(new Ana().todosSabem); // outra forma de instanciar
	}


}
