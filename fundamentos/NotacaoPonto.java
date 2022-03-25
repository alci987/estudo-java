package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Bom dia X";
		
		s.toUpperCase();
		System.out.println(s); // vai mostrar a string normal pq a fun��o toUpperCase() n�o altera a string normal
		
		// para usar a fun��o toUpperCase() � preciso atribuir a uma vari�vel
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "Senhora"); // substitui X por Senhora
		System.out.println(s);
		
		s = s.concat("!!!"); // concatena ao final da string
		System.out.println(s);
		
		//� possivel usar a not��o ponto dentro de uma strig dessa forma: "Alci".toUpperCase()
		System.out.println("Alci".toUpperCase());
		
		// oura forma de usar a nota��o ponto
		String y = "Bom dia X"
				.replace("X", "Alci")
				.toUpperCase()
				.concat(" tudo bem?");
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador .
	}

}
