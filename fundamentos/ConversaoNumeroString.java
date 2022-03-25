package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 10000;
		
		/*
		 * usando o wrapper Integer e convertendo para string
		 * com o método .toString(), vc tem acesso a funcionalidades
		 * que só uma string tem, como por exemplo o .length(), que 
		 * mostra quantos caracteres tem o elemento
		 */
		System.out.println(num1.toString().length());
		System.out.println(num1);
		
		// Outra forma de converter um int para string
		int num2 = 10000;
		System.out.println(Integer.toString(num2));
		
		// Uma jeito informal de converter numero para string
		System.out.println(("" + num2).length());

	}

}
