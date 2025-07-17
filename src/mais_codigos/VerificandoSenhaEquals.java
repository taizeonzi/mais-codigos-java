package mais_codigos;

import java.util.Scanner;

// projeto de estudo do livro java para leigos

public class VerificandoSenhaEquals {

	public static void main(String[] args) {
		System.out.println("Qual é a senha?");

		Scanner sc = new Scanner(System.in);
		String senha = sc.next();

		System.out.println("Você digtou >>" + senha + "<<");
		System.out.println();

		if (senha == "swordfish") { /* não é correto usar == neste caso */
			System.out.println("A palavra digitada está gravada no mesmo lugar que a senha verdadeira senha.");
			System.out.println("Você tem que ser hacker");

		} else {
			System.out.println("A palavra digitada não está gravada no mesmo lugar que a senha, mas não tem problema.");
		}
		System.out.println();
		if (senha.equals("swordfish")) { /* está correto usar o EQUALS -- PODE SER TBM ("swordfish".equals(senha)) */
			System.out.println("A palavra digitada é a mesma que a senha real. Pode usar o sistema.");
		} else {
			System.out.println("A palavra digitada não é a mesma que a senha real. Não pode usar o sistema.");
		}

	}

}
