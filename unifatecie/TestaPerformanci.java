package unifatecie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformanci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando...");
		
		long inicio = System.currentTimeMillis();
		Collection<Integer> teste = new ArrayList<Integer>();
		//Collection<Integer> teste = new HashSet<Integer>();
		
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);

	}

}
