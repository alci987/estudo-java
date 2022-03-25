package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner serve pra pegar o que o usu�rio digita
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantas notas? "); // pede o tamanho do array

		int qtdeNotas = entrada.nextInt(); // quarda o tmanho na vari�vel

		double[] notas = new double[qtdeNotas]; // passa o tamanho digitado para o array

		// percorre o array para pegar cada valor digitado
		for (int i = 0; i < notas.length; i++) {

			System.out.print("Informe a nota " + (i + 1) + ": ");

			notas[i] = entrada.nextDouble(); // atribui o que o usu�rio digitou ao array notas
		}

		double total = 0;
		// percorre o array novamente apenas para somar as notas digitadas 
		for (double nota : notas) {
			total += nota;
		}
		double media = total / notas.length;
		System.out.println("A m�dia das nostas �: " + media);

		System.out.println(Arrays.toString(notas));

		entrada.close(); // fecha o scanner

	}

}
