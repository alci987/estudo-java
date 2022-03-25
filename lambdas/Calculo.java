package lambdas;

/*
 * @FunctionalInterface garante que a interface só tenha uma único método para que se
 * se possa usar expressões lâmbdas
 * Interface funcional só tem apenas um método que seja public abstract
 * mas não impede que ela tenha, por exemplo, um método default ou
 * métodos staticos, logo, a interface abaixo é válida
 */

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	// Esse método será acessado pela classe por ser estático
	static String muitoLegal() {
		return "muito legal";
	}
}
