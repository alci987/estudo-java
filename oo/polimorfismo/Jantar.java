package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.1);
		Comida comida = new Sorvete(0.5); // S� pode pq sorvete � uma comida
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());

	}

}
