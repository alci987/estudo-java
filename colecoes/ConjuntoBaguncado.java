package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "unchecked", "rawtypes" }) // evita os warnings
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		
		/*
		 * O Set n�o suporta tipos primitivos. Nesse caso, ele vai
		 * automaticamente fazer um wrapper.
		 * O conjunto n�o aceita repeti��o, logo:
		 * conjunto.add(54);
		 * conjunto.add(54); // esse n�o vai ser adicionado
		 * O conjunto n�o � ordenado por padr�o
		 * Pode ser heterog�neo mas o ideal � que seja homog�neo,
		 * ou seja, do mesmo tipo
		 */
		
		conjunto.add(1.2); // aqui faz o wrapper para Double;
		conjunto.add(true);
		conjunto.add("Alciliano");
		conjunto.add(54);
		
		// mostra a quantidade de elementos de um conjunto
		System.out.println("Tamanho: " + conjunto.size());  // 4 elementos
		
		// Remover elementos do conjunto
		// O m�todo remove retorna verdadeiro ou falso
		System.out.println(conjunto.remove("Alciliano"));// retorna true
		
		// O m�todo contains retorna verdadeiro ou falso
		System.out.println(conjunto.contains(54));
		
		// Outra forma de criar um conjunto
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		/*
		 * Para imprimir o conjunto, basta chamalo na sa�da do console 
		 * pois o mesmo j� tem um m�todo toString por padr�o
		 * 
		 */
		System.out.println(conjunto);
		System.out.println(nums);
		
		/// Uni�o de conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		Set n = new HashSet();
		n.add(1);
		n.add(2);
		n.add(3);
		
		Set m = new HashSet();
		m.add(2);
		m.add(3);
		m.add(4);
		
		//Interce��o de conjuntos
		m.retainAll(n);
		System.out.println(m);
		
		// limpando o conjunto
		conjunto.clear();
		
		
	}

}
