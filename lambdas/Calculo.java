package lambdas;

/*
 * @FunctionalInterface garante que a interface s� tenha uma �nico m�todo para que se
 * se possa usar express�es l�mbdas
 * Interface funcional s� tem apenas um m�todo que seja public abstract
 * mas n�o impede que ela tenha, por exemplo, um m�todo default ou
 * m�todos staticos, logo, a interface abaixo � v�lida
 */

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	// Esse m�todo ser� acessado pela classe por ser est�tico
	static String muitoLegal() {
		return "muito legal";
	}
}
