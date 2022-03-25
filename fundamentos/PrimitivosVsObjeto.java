package fundamentos;

public class PrimitivosVsObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tudo em java é objeto, menos os tipos primitivos
		// A classe String cria objetos
		String z = new String("Bom dia"); // s é um objeto
		z = z.toLowerCase();
		String t = "t também é um objeto";
		t = t.toUpperCase();

		// Wrappers ou envólucros é a versão "objeto" dos tipos primitivos

		// byte
		Byte b = 100;
		System.out.println(b.byteValue()); // exibe 100
		System.out.println(b);

		// short
		Short s = 1000;

		// int
		Integer i = 10000;
		Integer ii = Integer.parseInt("245"); // convertendo uma string em int

		// long
		Long l = 100000L;
		
		// float
		Float f = 100.10F;
		
		// double
		Double dou = 2345.67;
		
		// boolean
		Boolean bo = false;
		bo = Boolean.parseBoolean("true"); // converte a string true para boolean
		
		// char
		Character c = 'A';
		System.out.println(c.toString());

		// para formatar o texo da classe: Ctrl + shift + f

	}

}
