package fundamentos;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		
		double a = 1; // conversão implícita - fica 1.0
		System.out.println(a);
		
		/*
		 * float b = 1.0; dessa forma tem de ser feito o castin pois, 
		 * por padrão seria double e não float
		 * Existem duas maneiras de fazer a conversão:
		 * 1) float b = 1.0F
		 * 2) float b = (float) 1.0; // dessa forma é feita uma conversão explícita
		 * Só havera perda de informação na conversão explícita entre float e double, 
		 * se o número não couber no float. Dessa forma, o número será truncado
		 */
		float b = (float) 1.12345;
		
		System.out.println(b);
		
		/*
		 * O java não analiza o valor e sim o tipo de dado armazenado, logo:
		 * int c = 4;
		 * byte d = c; não vai ser possível pois, embora 4 caiba em um byte, 
		 * o tipo int é maior que o tipo byte. Nesse caso, deve-se faer uma 
		 * conversão explícita mas, se o valor extrapolar o limite de armazenamento
		 * da variável, ele será truncado e pode haver valores estranhos
		 */
		
		int c = 4;
		byte d = (byte)c; // conversão explícita (CAST)
		
		System.out.println(d);
		
		double e =1.999999;
		int f = (int) e; // cast de int ele não arredonda. Vai dar o valor 1;
		System.out.println(f);

	}

}
