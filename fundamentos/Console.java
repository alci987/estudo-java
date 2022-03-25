package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Bom"); // sem o ln, imprime e permanece na mesma linha
		System.out.print(" dia\n");// imprime na mesma linha mas o \n quebra a linha
		System.out.println("Bom dia"); // imprime e quebra a linha
		// no printf n�o tem quebra de linha. precisa usar o \n ou %n
		System.out.printf("Mega sena %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // a ordem importa
		
		// Pegando informa��es do teclado apartir do console
		// System.out - sa�da do sistema - a sa�da padr�o � a tela
		// System.in - entrada do sistema
		Scanner entrada = new Scanner(System.in); // a entrada padr�o � o teclado
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("\nSeja bem vindo %s %s, voc� tem %d anos.", nome, sobrenome, idade);
		
		entrada.close(); // � preciso fechar o Scanner pra n�o ficar utilizando recurso da m�quina
		

	}

}
