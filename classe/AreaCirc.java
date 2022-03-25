package classe;

public class AreaCirc {

	double raio;
	/*
	 * Quando se cria um atributo static, geralmente o mesmo � constante pois deixar
	 * ele variando pode causar problemas, ou seja � um atributo final. A palavra
	 * static faz com que o atributo seja de classe e n�o de instancia e por
	 * conven��o, constates s�o escritas com letras main�sculas
	 */
	static final double PI = 3.14; //

	AreaCirc(double raioInicial) {
		// TODO Auto-generated constructor stub
		raio = raioInicial;
	}

	double area() {
		// return pi * raio * raio;
		return PI * Math.pow(raio, 2); // forma mais usual
	}

	// criando um m�todo statico
	static double raio(double raio) {
		return PI * Math.pow(raio, 2); // forma mais usual
	}

}
