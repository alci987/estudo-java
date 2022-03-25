package oo.encapsulamento.casaA;

public class Ana {

	@SuppressWarnings("unused")
	private String segredo = ""; // visibilidade somente pra classe
	String façoDendeDeCasa = ""; // visibiliade dentro do pacote - é o padrão
	protected String formaDeFalar = ""; // visivel para a classe e as filhas
	public String todosSabem = ""; // visivel para todos
}
