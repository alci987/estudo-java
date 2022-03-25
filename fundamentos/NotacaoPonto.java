package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Bom dia X";
		
		s.toUpperCase();
		System.out.println(s); // vai mostrar a string normal pq a função toUpperCase() não altera a string normal
		
		// para usar a função toUpperCase() é preciso atribuir a uma variável
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "Senhora"); // substitui X por Senhora
		System.out.println(s);
		
		s = s.concat("!!!"); // concatena ao final da string
		System.out.println(s);
		
		//É possivel usar a notção ponto dentro de uma strig dessa forma: "Alci".toUpperCase()
		System.out.println("Alci".toUpperCase());
		
		// oura forma de usar a notação ponto
		String y = "Bom dia X"
				.replace("X", "Alci")
				.toUpperCase()
				.concat(" tudo bem?");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador .
	}

}
