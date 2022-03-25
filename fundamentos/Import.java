package fundamentos;

import java.util.Date;

public class Import {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Algumas funcionalidades do java não vêm por padrão e para isso
		 * elas devem ser importadas usando a palavra chave import
		 */
		
		Date d = new Date(); // pertence ao pacote java.util.Date
		System.out.println(d);
		
		// OBS: para organizar os imports automaticamente: Cltr + shift + o
		// Tanto retirando imports não usados como importando os necessários

	}

}
