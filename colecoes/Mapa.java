package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * não pode ter chaves duplicadas, logo, se tiver a mesma chave, os demais serão ignorados
		 * Não matém as chaves ordenadas
		 */
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		// adicionando elementos no mapa
		/*
		 * O método put, tanto adicionar, se não existir, quanto
		 * atualiza, caso exista o elemento
		 */
		usuarios.put(1, "Alciliano da Silva Lima");
		usuarios.put(2, "Ana Mirian da Silva");
		usuarios.put(3, "João Victor da Silva Lima");
		usuarios.put(4, "Levi da Silva Lima");
		usuarios.put(5, "Benjamim da Silva Lima");
		
		// pegando o tamanho do mapa
		System.out.println(usuarios.size());
		
		// verificado se tem ou não elementos
		System.out.println(usuarios.isEmpty()); // retorna true ou false
		
		// pegando o conjunto das chaves
		System.out.println(usuarios.keySet()); // exibe as chaves nesse formato: [1, 2, 3, ...]
		
		// pegando apenas os valores
		System.out.println(usuarios.values()); // exibe ao valores nesse formato: [valor1, valor2, valor3, ...]
		
		// pegando chave e valor
		System.out.println(usuarios.entrySet());
		
		// verificando se um item existe, tanto por chave, quanto por valor
		System.out.println(usuarios.containsKey(2)); // retorna true ou false
		System.out.println(usuarios.containsValue("valor")); // retorna true ou false
		
		// pegando o valor a partir da chave
		System.out.println(usuarios.get(4));
		
		// removendo um elemento do mapa
		System.out.println(usuarios.remove(1)); // retorna o elemento removido
		
		// removeno elemento do mapa usando chave e valor
		System.out.println(usuarios.remove(2, "Levi")); // só remove se ambas forem iguais
		
		// percorrendo um mapa para pegar as chaves
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		// percorrendo o mapa para pegar o valor
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		// percorrendo o mapa para pegar chave e valor
		// Entry<Integer, String> vem do pacote java.util.Map.Entry
		for(Entry<Integer, String> linha: usuarios.entrySet()) {
			System.out.println("ID: " + linha.getKey() + " - Nome: " + linha.getValue() + ".");
		}

	}

}
