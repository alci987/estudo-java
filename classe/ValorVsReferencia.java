package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b = a; // atribui��o por valor
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);

		Data d1 = new Data(1, 7, 1970);
		Data d2 = d1; // atribui��o por refer�ncia

		d1.dia = 5; // vai impactar em d1 e d2
		d2.mes = 10; // vai impactar em d1 e d2

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		voltarValorParaDataPadrao(d2);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		alteraPrimitivo(c); // n�o vai sofrer altera��o por serem vari�veis diferentes e sim apenas uma
							// c�pia
		System.out.println(c);

	}

	static void voltarValorParaDataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alteraPrimitivo(int a) {
		a++;
	}

}
