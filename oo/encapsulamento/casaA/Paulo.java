package oo.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeAcessos() {
		//System.out.println(esposa.segredo); // n�o pode acessar
		System.out.println(esposa.fa�oDendeDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}

}
