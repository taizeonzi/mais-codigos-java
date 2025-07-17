package mais_codigos_objetos_compostos;

// projeto de estudo do curso de java (objetos compostos) prof. Guanabara

public class UltraEmojiCombat {

//Toda vez que temos agregação, significa que a parte pode ser compartilhada entre vários objetos.	
//Agregação	É quando um objeto possui outros objetos, ele não depende desses objetos para existir
//Composição É quando um objeto é formado por outros objetos. Ou seja, suas partes o compõem, sem elas o objeto não existe.	
	
	public static void main(String[] args) {
		// objeto dentro de vetor - instância da classe lutador
		Lutador l[]= new Lutador[6];/*são 6 lutadores, trato como um array*/
		
		//instâncias da classe lutador
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f,
							68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
				59.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f,
				80.9f, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f,
				81.6f, 13, 0, 2);
		l[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f,
				119.3f, 5, 4, 3);
		l[5] = new Lutador("Nerdart", "EUA", 30, 1.81f,
				105.7f, 12, 2, 4);
		
		/*l[3].setPeso(40f);/*se eu alterar o peso para 40, aparece peso inválido
		l[3].apresentar();
		System.out.println();
		System.out.println("**************");
		l[3].status();
		System.out.println();
		System.out.println("**************");
		l[3].perderLuta();vai acrescentar 1 no "perdeu 0 vezes"
		l[3].status();*/
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[4], l[5]);
		UEC01.lutar();
		System.out.println();
		l[4].status();
		System.out.println();
		l[5].status();
	}

}
