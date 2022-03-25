package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila { // First in, First out

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<String>(); // LinkedList representa filas em java
		
		/*
		 * offer e add -> adicionam elementos na fila
		 * a diferen�a � o comportamento quando a fila est� cheia
		 */
		
		// adicionando itens na fila
		fila.add("Alciliano"); // se n�o conseguir adicionar, retorna falso
		//outra forma de adicionar elementos na fila
		fila.offer("Levi"); // se n�o conseguir adicionar, lan�a uma exce��o
		fila.add("Mirian");
		fila.add("Jo�o");
		fila.add("Alciliano");
		
		/*
		 * pegando elementos da fila
		 * fila.peek() pega o elemento da fila mas n�o remove
		 * fila.element() tamb�m pega um elemento da fila mas n�o remove
		 * a diferen�a entre eles � quando a fila est� vazia
		 * peek() - retorna nulo se n�o existir elementos
		 * element() - d� um erro de noSuchElementoException
		 */
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		// fila.size(); pega o tamanho da fila
		// fila.clear(); limpa a fila
		// fila.isEmpty(); retorna true ou false
		// fila.contains(elemento);
		
		// poll() retorna nulo se n�o tiver elemento na fila
		// remove() faz a mesma coisa que o poll() mas se a fila estiver vazia, lan�a uma exce��o
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila e remove
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila e remove
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila e remove
		

	}

}
