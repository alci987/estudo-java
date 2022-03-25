package lambdas;

public class CalculoTeste {

	/*
	 * Essa é a forma tradicional sem lambda
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculo calculo = new Soma();
		
		System.out.println(calculo.executar(3, 5));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(7, 5));

	}

}
