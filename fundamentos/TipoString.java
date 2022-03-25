package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pegando uma letra pelo índice
		System.out.println("Bom dia pessoal".charAt(2));
		
		String s = "Boa tarde"; // A string é um objeto imutável
		System.out.println(s.concat("!!!"));
		//concatenando de outra forma
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa")); // retorna true
		System.out.println(s.startsWith("boa")); // retorna false
		System.out.println(s.toLowerCase().startsWith("boa")); // retorna true pq antes foi colocada em minúscula
		System.out.println(s.length()); // retorna o tamanhoa da string
		System.out.println(s.endsWith("tarde")); // retorna true
		System.out.println(s.equals("boa tarde")); // retorna false pq é case sensitive
		System.out.println(s.equalsIgnoreCase("boa tarde")); // retorna true
		
		var nome = "Alciliano";
		var sobrenome = "da Silva Lima";
		var idade = 38;
		var salario = 12345.45;
		
		// outra forma de formatar uma string
		// %s para string
		// %d para inteiros
		// %f para float e double
		// %.2f duas casas decimais
		// \n quebra de linha
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.\n\n", 
				nome, sobrenome, idade, salario);
		
		// Criando a mesma frase
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f.", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual")); // retorna true
		System.out.println("Frase qualquer".indexOf("qual")); // retorna a posição inicial da palavra
		System.out.println("Frase qualquer".substring(6)); // mostra a frase apartir da 6 posição
		System.out.println("Frase qualquer".substring(6,9)); // mostra do 6 até o 8. Não mostra o índice 9

	}

}
