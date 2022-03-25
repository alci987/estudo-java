package colecoes;

import java.util.Objects;

public class Usuario {
	
	Usuario(String nome){
		this.nome = nome;
	}
	
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Meu nome é: " + this.nome + ".";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}


	String nome;

}
