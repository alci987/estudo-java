package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> lista = new HashSet<String>(); // Conjunto de Strings
		// Também pode ser assim: Set<String> lista = new HashSet<>();
		lista.add("Alciliano");
		lista.add("Ana Mirian");
		lista.add("João Victor");
		lista.add("Levi");
		lista.add("Benjamim");
		lista.add("Kaleb");
		
		/*
		 * O HashSet não respeita a ordenação dos elementos
		 * Para criar um conjunto ordenado use o TreeSet
		 */
		
		// percorrendo o conjunto com um foreach
		for(String nome: lista) {
			System.out.println(nome);
		}
		
		// Criando um conjunto ordenado com o TreeSet
		SortedSet<String> ordenado = new TreeSet<String>();
		ordenado.add("Alciliano");
		ordenado.add("Ana Mirian");
		ordenado.add("João Victor");
		ordenado.add("Levi");
		ordenado.add("Benjamim");
		ordenado.add("Kaleb");

		System.out.println("Conjunto ordenado com TreeSet");
		for (String ordem : ordenado) {
			System.out.println(ordem);
		}
		
		// Conjunto de inteiros
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		for(int n: nums) {
			System.out.println(n);
		}
	}

}
