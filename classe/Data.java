package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	String formato = "%d/%d/%d"; // vari�vel "global" que pode ser acessada em qualquer lugar da classe

	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		// chamar um construtor a partir de outro
		this(1, 1, 1970); // � a mesma coisa de cima. Est� chamando o construtor

		/*
		 * Valores padr�es byte, short, int, long -> 0 
		 * float, decimal -> 0.0 
		 * boolean -> false 
		 * char -> '\u0000' 
		 * objeto -> null. Ex: String s; recebe null por padr�o
		 * null (n�o aponta pra nenhum objeto na mem�ria)
		 * Esses valores s� ser�o atribu�dos se forem vari�veis
		 * 'globais'. Se forem vari�veis locais, esses valores n�o ser�o atribu�dos por
		 * padr�o e dever�o ser atribu�dos
		 */
	}

	/*
	 * this altera a vari�vel de instancia
	 */
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// melhor usar o m�todo com retorno por ser mais flex�vel
	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; // vari�vel local
		return String.format(formato, this.dia, mes, ano); // n�o precisa do this
	}

	// outra forma de mostrar a data
	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}

}
