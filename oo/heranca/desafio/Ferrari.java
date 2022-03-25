package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	boolean ligarTurbo = false;
	boolean ligarAr = false;

	Ferrari() {
		this(350); // velocidade máxima padrão da Ferrari
	}

	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		setDelta(35);
		ligarTurbo = true;

	}

	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		setDelta(15);
		ligarTurbo = false;

	}

	@Override
	public void ligarAr() {
		// TODO Auto-generated method stub
		ligarAr = true;

	}

	@Override
	public void desligarAr() {
		// TODO Auto-generated method stub
		ligarAr = false;

	}

	@Override
	public int getDelta() {
		// TODO Auto-generated method stub
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		}else {			
			return 15;
		}
	}
}
