package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
		
		System.out.println("Monstro te: " + monstro.vida);
		System.out.println("Horoi tem: " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("Monstro te: " + monstro.vida);
		System.out.println("Horoi tem: " + heroi.vida);
		

	}

}
