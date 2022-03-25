package classe;

public class EqualsHashCode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";

		System.out.println(u1 == u2); // retorna falso pq são 2 objetos distintos na memória
		System.out.println(u1.equals(u2)); // vai retornar a mesma coisa
		System.out.println(u2.equals(u1)); // vai retornar a mesma coisa
	}
}
