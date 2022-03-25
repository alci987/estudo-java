package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Alciliano", -120);
		p1.setNome("Alciliano");
		p1.setIdade(-28);
		
		System.out.println(p1.getNome());
		System.out.println(p1);

	}

}
