package classe;

public class AreaCirc {

	double raio;
	/*
	 * Quando se cria um atributo static, geralmente o mesmo é constante pois deixar
	 * ele variando pode causar problemas, ou seja é um atributo final. A palavra
	 * static faz com que o atributo seja de classe e não de instancia e por
	 * convenção, constates são escritas com letras mainúsculas
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

	// criando um método statico
	static double raio(double raio) {
		return PI * Math.pow(raio, 2); // forma mais usual
	}

}
