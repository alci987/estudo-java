package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// F�rmula: (�F - 32) * 5/9 = �C	
		
		
		final double FATOR = 5.0 / 9.0;
		final int AJUSTE = 32;
		
		double f = 86;
		
		
		double c = (f - AJUSTE) * FATOR;
		System.out.println("Temperatura em grau celcius = " + c + "�C");
		
		/*
		 * para duplicar uma linha de c�digo: Ctrl + Alt + seta pra cima/baixo
		 * para mover uma linha de c�digo: Alt + seta pra cima/baixo
		 */
	}

}
