package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha { // Last in, First out 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O Pequeno Príncipe"); // retorna true ou false
		livros.push("A pequena seria"); // não retorna nada
		livros.push("Don Quixote");
		
		// como é uma pilha, o último a entrar é o primeiro a sair
		// amos abaixo não removem o item da pilha, apenas mostr
		System.out.println(livros.peek()); // vai mostrar Don Quixote
		System.out.println(livros.element()); 
		
		// mostrando e removendo o elemento
		// o poll() retorna nula se não tiver o elemento
		// o remove() ou o pop() lança uma exceção
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		livros.size(); // pega o tamanho da pilha
		livros.clear(); // limpa a pilha
		
		

	}

}
