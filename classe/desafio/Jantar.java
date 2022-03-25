package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijão", 0.3 );
		
		Pessoa p1 = new Pessoa("Alciliano", 85.5);
		
		System.out.println(p1.apresentar());
		
		p1.comer(c1);
		p1.comer(c2);
		
		System.out.println(p1.apresentar());

	}

}
