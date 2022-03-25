package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila { // First in, First out

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<String>(); // LinkedList representa filas em java
		
		/*
		 * offer e add -> adicionam elementos na fila
		 * a diferença é o comportamento quando a fila está cheia
		 */
		
		// adicionando itens na fila
		fila.add("Alciliano"); // se não conseguir adicionar, retorna falso
		//outra forma de adicionar elementos na fila
		fila.offer("Levi"); // se não conseguir adicionar, lança uma exceção
		fila.add("Mirian");
		fila.add("João");
		fila.add("Alciliano");
		
		/*
		 * pegando elementos da fila
		 * fila.peek() pega o elemento da fila mas não remove
		 * fila.element() também pega um elemento da fila mas não remove
		 * a diferença entre eles é quando a fila está vazia
		 * peek() - retorna nulo se não existir elementos
		 * element() - dá um erro de noSuchElementoException
		 */
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		// fila.size(); pega o tamanho da fila
		// fila.clear(); limpa a fila
		// fila.isEmpty(); retorna true ou false
		// fila.contains(elemento);
		
		// poll() retorna nulo se não tiver elemento na fila
		// remove() faz a mesma coisa que o poll() mas se a fila estiver vazia, lança uma exceção
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila e remove
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila e remove
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila e remove
		

	}

}
