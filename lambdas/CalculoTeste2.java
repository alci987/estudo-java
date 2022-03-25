package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		/*
		 * � poss�vel criar fun��es anonimas e passar ela pra vari�veis Com l�mbdas,
		 * isso: Calculo calculo = new Soma(); calculo.executar(3, 5) pode ser feito
		 * assim: Calculo calculo = (x, y) -> {return x + y; };
		 */
		Calculo calculo = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo.executar(7, 7));

		calculo = (x, y) -> x * y; // n�o precisa do retorno sem os parenteses
		System.out.println(calculo.executar(10, 5));

		System.out.println(calculo.legal());
		
		// acessando um m�tod est�tico da interface
		System.out.println(Calculo.muitoLegal());
	}

}
