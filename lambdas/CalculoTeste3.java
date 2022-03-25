package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		/*
		 * É possível criar funções anonimas e passar ela pra variáveis Com lámbdas,
		 * isso: Calculo calculo = new Soma(); calculo.executar(3, 5) pode ser feito
		 * assim: Calculo calculo = (x, y) -> {return x + y; };
		 */
		
		/*
		 * BinareOperator<T> é uma interface do java.util.fuction que pega
		 * dois valores do mesmo tipo e faz um calculo
		 * 				Observação
		 * O java não permite conversões desse tipo:
		 * int -> Double Ex: Double a = 1; vai dar erro mas: Double a = 1.0 funciona
		 * mas com tipos primitivos funciona: double a = 2
		 * E as interfaces no java não trabalham com tipos primitivos, por isso:
		 * 		BinaryOperator<Double> calculo = (x, y) -> {
					return x + y;
				};
				System.out.println(calculo.apply(7, 7));
				não vai funcionar
		 * 
		 * 
		 */
		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo.apply(7.0, 7.0));

		calculo = (x, y) -> x * y; // não precisa do retorno sem os parenteses
		System.out.println(calculo.apply(10.1, 5.2));
		
		BinaryOperator<Integer> calculo2 = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo2.apply(7, 7));

		calculo = (x, y) -> x * y; // não precisa do retorno sem os parenteses
		System.out.println(calculo2.apply(10, 5));

	}

}
