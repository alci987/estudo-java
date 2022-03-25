package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		// tipos numéricos inteiros do menor para o maior
		byte anosDeEmpresa = 23; // tem
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // é possível usar o _ pra separar as casas. O L é pra mostrar que é longo
		
		// Tipos numéricos reais do menor para o maior
		float salario = 11_445.44F; // por padrão, seria double mas se colocar a letra f/F mostra que é um float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false; // aceita apenas false ou true
		
		// tipo caractere
		char status = 'A'; 
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		/**
		 * ********* TIPOS PRIMITIVOS *********
		 * byte   =  1 byte
		 * short  =  2 bytes
		 * int    =  4 bytes
		 * long   =  8 bytes
		 * float  =  4 bytes
		 * double =  8 bytes
		 *  
		 * Tipo		Tamanho (bits)		Faixa												Valor Padrão
		 *  byte	       8		-128 a 127													0
		 *  short		   16		-32.768 a 32.767											0
		 *	int			   32		-231 a 231 – 1												0
		 *	long		   64		-263 a 263 -1												0L
		 *  float		   32	IEEE 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38		0.0f
		 *	double		   64	IEEE 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308	0.0d

		 */
		
		
	}
}
