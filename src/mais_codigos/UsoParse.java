package mais_codigos;

import java.util.Scanner;

public class UsoParse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		String idadeTexto = sc.nextLine();
		
		try {
			int idade = Integer.parseInt(idadeTexto); //converte a String para inteiro usando parse
			System.out.println("Daqui um ano você terá " + (idade + 1) + " anos.");
		}catch (Exception e) {//na verdade é um NumberFormatException
			System.out.println("Erro: você digitou um valor inválido. Digite apenas números.");
		}
		sc.close();
	}

}
/*🧠 O que esse código faz?
1.Lê um texto digitado pelo usuário.
2.Usa Integer.parseInt() para transformar o texto em número.
3.Se a conversão der certo, ele soma +1 e mostra o resultado.
4.Se o usuário digitar algo como "abc", o programa não trava. Ele mostra uma mensagem de erro graças ao try-catch.
*/