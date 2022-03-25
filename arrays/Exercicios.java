package arrays;

import java.util.Arrays;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Arrays são objetos homogênios, de tamanho fixo
		 * Formas de criar um array em java:
		 * double[] notasAlunoA = new double[3];
		 * double notasAlunoA[] = new double[3];
		 * double []notasAlunoA = new double[3];
		 * double [] notasAlunoA = new double[3];
		 */
		double[] notasAlunoA = new double[3];
		
		// Atribuindo valores ao array
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8; // o java faz a conversão implícita
		notasAlunoA[2] = 6.7;
		
		// formas de imprimir um array
		/*
		 * importano de java.util, a classe Arrays serve pra transformar
		 * o array em string para ser impresso como no python
		 */
		System.out.println(Arrays.toString(notasAlunoA));
		
		// percorrendo o array com o laço for
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.println(notasAlunoA[i]);
		}
		
		// percorrendo o array para calcular a média das notas
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		totalAlunoA /= notasAlunoA.length;
		System.out.println("A média das notas é: " + totalAlunoA);
		
		// outra forma de declarar e atribuir valores em um array
		double totalAlunoB = 0.0;
		double[] notasAlunoB = { 8.9, 7.5, 9.0 };
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB.length;
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
