package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(new Usuario("Alciliano"));
		usuarios.add(new Usuario("Mirian"));
		usuarios.add(new Usuario("João"));
		usuarios.add(new Usuario("Levi"));
		
		/*
		 * Só retorna true pq foi implementado o método hasCode que serve para 
		 * varrer a classe e comparar as informações
		 */
		System.out.println(usuarios.contains(new Usuario("Mirian")));
		

	}

}
