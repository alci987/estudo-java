package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(new Usuario("Alciliano"));
		usuarios.add(new Usuario("Mirian"));
		usuarios.add(new Usuario("Jo�o"));
		usuarios.add(new Usuario("Levi"));
		
		/*
		 * S� retorna true pq foi implementado o m�todo hasCode que serve para 
		 * varrer a classe e comparar as informa��es
		 */
		System.out.println(usuarios.contains(new Usuario("Mirian")));
		

	}

}
