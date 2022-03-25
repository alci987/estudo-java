package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	String formato = "%d/%d/%d"; // variável "global" que pode ser acessada em qualquer lugar da classe

	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		// chamar um construtor a partir de outro
		this(1, 1, 1970); // é a mesma coisa de cima. Está chamando o construtor

		/*
		 * Valores padrões byte, short, int, long -> 0 
		 * float, decimal -> 0.0 
		 * boolean -> false 
		 * char -> '\u0000' 
		 * objeto -> null. Ex: String s; recebe null por padrão
		 * null (não aponta pra nenhum objeto na memória)
		 * Esses valores só serão atribuídos se forem variáveis
		 * 'globais'. Se forem variáveis locais, esses valores não serão atribuídos por
		 * padrão e deverão ser atribuídos
		 */
	}

	/*
	 * this altera a variável de instancia
	 */
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// melhor usar o método com retorno por ser mais flexível
	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; // variável local
		return String.format(formato, this.dia, mes, ano); // não precisa do this
	}

	// outra forma de mostrar a data
	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}

}
