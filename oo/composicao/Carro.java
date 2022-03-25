package oo.composicao;

/*
 * Composição: pegar um objeto e quebrar ele em objetos menores. 
 * Ex: classe carro que tem classe motor, classe portas. Essa é uma relação 1 - 1
 */
public class Carro {
	
	Motor motor = new Motor(); // relação 1 - 1 com a classe Motor
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
			
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
			
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}

}
