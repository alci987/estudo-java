package fundamentos;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		
		double a = 1; // convers�o impl�cita - fica 1.0
		System.out.println(a);
		
		/*
		 * float b = 1.0; dessa forma tem de ser feito o castin pois, 
		 * por padr�o seria double e n�o float
		 * Existem duas maneiras de fazer a convers�o:
		 * 1) float b = 1.0F
		 * 2) float b = (float) 1.0; // dessa forma � feita uma convers�o expl�cita
		 * S� havera perda de informa��o na convers�o expl�cita entre float e double, 
		 * se o n�mero n�o couber no float. Dessa forma, o n�mero ser� truncado
		 */
		float b = (float) 1.12345;
		
		System.out.println(b);
		
		/*
		 * O java n�o analiza o valor e sim o tipo de dado armazenado, logo:
		 * int c = 4;
		 * byte d = c; n�o vai ser poss�vel pois, embora 4 caiba em um byte, 
		 * o tipo int � maior que o tipo byte. Nesse caso, deve-se faer uma 
		 * convers�o expl�cita mas, se o valor extrapolar o limite de armazenamento
		 * da vari�vel, ele ser� truncado e pode haver valores estranhos
		 */
		
		int c = 4;
		byte d = (byte)c; // convers�o expl�cita (CAST)
		
		System.out.println(d);
		
		double e =1.999999;
		int f = (int) e; // cast de int ele n�o arredonda. Vai dar o valor 1;
		System.out.println(f);

	}

}
