package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		//predicado retorna true ou false
		Predicate<Produto> isCaro = prod -> false;
		
		Produto p = new Produto("Caneta", 10.0, 0.2);
		
		System.out.println(isCaro.test(p));
	}

}
