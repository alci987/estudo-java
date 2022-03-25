package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Bom"); // sem o ln, imprime e permanece na mesma linha
		System.out.print(" dia\n");// imprime na mesma linha mas o \n quebra a linha
		System.out.println("Bom dia"); // imprime e quebra a linha
		// no printf não tem quebra de linha. precisa usar o \n ou %n
		System.out.printf("Mega sena %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // a ordem importa
		
		// Pegando informações do teclado apartir do console
		// System.out - saída do sistema - a saída padrão é a tela
		// System.in - entrada do sistema
		Scanner entrada = new Scanner(System.in); // a entrada padrão é o teclado
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("\nSeja bem vindo %s %s, você tem %d anos.", nome, sobrenome, idade);
		
		entrada.close(); // é preciso fechar o Scanner pra não ficar utilizando recurso da máquina
		

	}

}
