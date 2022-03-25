package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * � poss�vel criar uma vari�vem sem atribuir � ela um tipo
		 * Nesse caso, o java vai inferir o tipo, pelo valor da vari�vel
		 * sintaxe: var b = 4.5 nesse caso o java entende que � uma vari�vel do tipo double
		 */
		
		var b = 4.5; // tipo couble
		System.out.println(b);
		
		var c = "Isso � um texto"; // infere ser uma string
		System.out.println(c);
		
		var a = 5; // foi declarada e inicializada com valor inteiro 5
		
		boolean d; // foi declarada
		d = false; // foi inicializada
		System.out.println(a);
		System.out.println(d);
		
		/**
		 * Se usar var, ela tem de ser declarada e inicializada ao mesmo tempo pois � na
		 * inicializa��o que o java vai saber de qual tipo se trata
		 */

	}

}
