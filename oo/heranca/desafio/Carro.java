package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	private int delta = 5;
	
	int velocidadeAtual;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	
	void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {			
			velocidadeAtual += getDelta();
		}
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
			
		}else {
			velocidadeAtual = 0;
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Velocidade atual: " + velocidadeAtual + "Km/h.";
	}


	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
