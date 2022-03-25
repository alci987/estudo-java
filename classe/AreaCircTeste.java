package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AreaCirc.pi = 3.1415; // acessando um atributo static
		AreaCirc a = new AreaCirc(5.6);
		System.out.println(a.area());
		System.out.println(AreaCirc.raio(5));
		System.out.println(Math.PI);
		/*
		 * OBS: Todo atributo em itálico significa que é um atributo da classe, ou seja, static
		 */

	}

}
