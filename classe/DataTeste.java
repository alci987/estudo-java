package classe;

public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d1 = new Data();
		//d1.dia = 5;
		//d1.mes = 1;
		//d1.ano = 1984;
				
		
		Data d2 = new Data(7, 3, 2022);
		//d2.dia = 7; já está sendo passado no construtor
		//d2.mes = 3; já está sendo passado no construtor
		//d2.ano = 2022; já está sendo passado no construtor
		System.out.println();
		
		System.out.println("Data 1: " + d1.obterDataFormatada());
		System.out.println("Data 2: " + d2.obterDataFormatada());
		
		// chamando o void
		d2.imprimirDataFormatada();
		
		

	}

}
