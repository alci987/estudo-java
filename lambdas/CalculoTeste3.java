package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		/*
		 * � poss�vel criar fun��es anonimas e passar ela pra vari�veis Com l�mbdas,
		 * isso: Calculo calculo = new Soma(); calculo.executar(3, 5) pode ser feito
		 * assim: Calculo calculo = (x, y) -> {return x + y; };
		 */
		
		/*
		 * BinareOperator<T> � uma interface do java.util.fuction que pega
		 * dois valores do mesmo tipo e faz um calculo
		 * 				Observa��o
		 * O java n�o permite convers�es desse tipo:
		 * int -> Double Ex: Double a = 1; vai dar erro mas: Double a = 1.0 funciona
		 * mas com tipos primitivos funciona: double a = 2
		 * E as interfaces no java n�o trabalham com tipos primitivos, por isso:
		 * 		BinaryOperator<Double> calculo = (x, y) -> {
					return x + y;
				};
				System.out.println(calculo.apply(7, 7));
				n�o vai funcionar
		 * 
		 * 
		 */
		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo.apply(7.0, 7.0));

		calculo = (x, y) -> x * y; // n�o precisa do retorno sem os parenteses
		System.out.println(calculo.apply(10.1, 5.2));
		
		BinaryOperator<Integer> calculo2 = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo2.apply(7, 7));

		calculo = (x, y) -> x * y; // n�o precisa do retorno sem os parenteses
		System.out.println(calculo2.apply(10, 5));

	}

}
