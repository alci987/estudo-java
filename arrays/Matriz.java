package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method
		// Scanner serve pra pegar o que o usuário digita
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos alunos? "); // pede o tamanho do array

		int qtdeAlunos = entrada.nextInt(); // quarda o tmanho na variável

		System.out.print("Quantas nots por aluno? "); // pede o tamanho do array

		int qtdenotas = entrada.nextInt(); // quarda o tmanho na variável

		// criando uma matriz
		double[][] notasDaTurma = new double[qtdeAlunos][qtdenotas];

		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", (n + 1), (a + 1));
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdeAlunos * qtdenotas);
		
		System.out.println("A média da turma foi: " + media);

		entrada.close(); // fecha o scanner

	}

}
