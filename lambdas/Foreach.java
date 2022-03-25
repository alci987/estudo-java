package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aprovados = Arrays.asList("Alci", "Mirian", "Jo�o", "Levi");

		System.out.println("Forma tradicional de percorrer uma lista:");
		for (String a : aprovados) {
			System.out.println(a);
		}

		System.out.println("\nLambda #01:");
		aprovados.forEach((a) -> {
			System.out.println(a + "!!!");
		});

		System.out.println("\nLambda feito de uma forma mais inxuta:");
		aprovados.forEach(a -> System.out.println(a + "!!!"));

		System.out.println("\nMethod preference:");
		aprovados.forEach(System.out::println);

		// ----------------------------------------------------------------------------

		System.out.println("\nLambda #02:");
		aprovados.forEach((a) -> meuImprimir(a));

		System.out.println("\nMethod preference #02:");
		aprovados.forEach(Foreach::meuImprimir);

	}

	static void meuImprimir(String nome) {
		System.out.println("Ol�, meu nome �: " + nome);
	}

}
