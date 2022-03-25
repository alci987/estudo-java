package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha { // Last in, First out 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O Pequeno Pr�ncipe"); // retorna true ou false
		livros.push("A pequena seria"); // n�o retorna nada
		livros.push("Don Quixote");
		
		// como � uma pilha, o �ltimo a entrar � o primeiro a sair
		// amos abaixo n�o removem o item da pilha, apenas mostr
		System.out.println(livros.peek()); // vai mostrar Don Quixote
		System.out.println(livros.element()); 
		
		// mostrando e removendo o elemento
		// o poll() retorna nula se n�o tiver o elemento
		// o remove() ou o pop() lan�a uma exce��o
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		livros.size(); // pega o tamanho da pilha
		livros.clear(); // limpa a pilha
		
		

	}

}
