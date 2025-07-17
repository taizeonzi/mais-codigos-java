package mais_codigos;

import java.util.Random;
import java.util.Scanner;

//projeto de estudo do livro java para leigos

public class AdivinhacaoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numPalpites = 0;
		int numeroAleatorio = new Random().nextInt(10) + 1;
		
		System.out.println("********************************");
		System.out.println("Bem vindo ao Jogo de Adivinhação");
		System.out.println("********************************");
		System.out.println();
		
		System.out.print("Insira um número de 1 a 10: ");
		int numeroEntrada = sc.nextInt();
		numPalpites++;
		
		while (numeroEntrada != numeroAleatorio) {
		System.out.println();
		System.out.println("Tente novamente..."); /*Pesquisar como mostrar o numero aleatorio anterior*/
		System.out.print("Insira um número de 1 a 10: ");
		numeroEntrada = sc.nextInt();
		numPalpites++;
		}
		System.out.println("Você ganhou depois de " + numPalpites + " tentativas.");
			
		}

	}