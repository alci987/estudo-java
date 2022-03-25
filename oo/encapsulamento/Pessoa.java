package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	
	// Setter
	public Pessoa(String nome, int idade){
		setNome(nome);
		setIdade(idade);
	}
	
	// Getter
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if (idade >= 0 && idade <= 120) {
			this.idade = idade;			
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Olá, eu sou o " + getNome() + " e tenho: " + getIdade() + " anos de idade.";
	}
	

}
