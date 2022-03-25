package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Uma lista pode ser homog�nea ou heterog�nea (mesmo tipo ou tipos diversos)
		 * aceita objetos duplicados
		 * � ordenado e indexado
		 */
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Alciliano");
		
		lista.add(u1);  // pode ser assim
		lista.add(new Usuario("Mirian")); // mas tamb�m pode ser assim
		lista.add(new Usuario("Jo�o Victor")); // mas tamb�m pode ser assim
		lista.add(new Usuario("Levi")); // mas tamb�m pode ser assim
		lista.add(new Usuario("Benjamim")); // mas tamb�m pode ser assim
		lista.add(new Usuario("Kaleb")); // mas tamb�m pode ser assim
		
		// pegando um elemento pelo �ndice
		System.out.println(lista.get(0)); // lista.get(indice) chama o m�todo toString()
		
		//removendo um �tem da lista
		lista.remove(0); // retorna o objeto exclu�o
		//outra forma de remover. Como essa classe est� usando o equals e o hashcode
		// de tal forma que vai identificar o usuario pelo nome, se � igual ou nao,
		// ele vai conseguir excluir
		lista.remove(new Usuario("Mirian")); // excluindo pelo nome do usuario. Retorna verdadeiro ou falso
		
		//verificando se uma lista contem determinado elemento. retorna true ou false
		lista.contains(new Usuario("Benjamim")); // retorna verdadeiro pq tem esse item na lista
		System.out.println("Tem? " + lista.contains(new Usuario("Benjamim")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome); // imprime de forma implicita
		}

	}

}
