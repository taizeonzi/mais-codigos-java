package maiscodigos_generics;

import java.util.Scanner;

public class Main {

	/*
	 * Utilizando interface, list e ArrayList. Composição entre duas classes, uma
	 * lista que irá fazer a gestão de um array que irá ser mapeado através da
	 * classe (Item). Lógica de como fazer um programa para controle financeiro.
	 * Onde pode ser cadastrado as contas pagas em cada mês, ter um gerenciamento do
	 * que foi pago e o que falta pagar.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// variáveis auxiliares
		int mes;
		String descDividaString; // descrição da dívida
		double preco;
		boolean status;
		int pago = 0;

		Lista listaSupermercado = new Lista(); // espera um tipo Item
		System.out.print("Informe o mês de [1 a 12]: ");
		mes = sc.nextInt();

		// lemos os itens
		System.out.print("Descrição da dívida: ");
		descDividaString = sc.next();
		System.out.print("Informe o preço: ");
		preco = sc.nextDouble();
		System.out.println("Está pago?\n1.SIM\n2.NÃO");
		pago = sc.nextInt();
		status = (pago == 1) ? true : false; // operador ternário

		listaSupermercado.setMes(mes);

		Item item1 = new Item();
		// passamos os itens lidos para a variável item1
		item1.setNome(descDividaString);
		item1.setPreco(preco);
		item1.setStatus(status);

		Item item2 = new Item();
		item2.setNome("Parcela do Apartamento");
		item2.setPreco(1045.60);
		item2.setStatus(true);

		Item item3 = new Item();
		item3.setNome("Curso de Inglês");
		item3.setPreco(350.00);
		item3.setStatus(false);

		// alimentamos a Lista listaSupermercado
		listaSupermercado.getItens().add(item1);
		listaSupermercado.getItens().add(item2);
		listaSupermercado.getItens().add(item3);

		System.out.println("=== LISTA DE CONTROLE DE FINANCEIRO ===");
		System.out.println("Mês: " + listaSupermercado.getMes());
		System.out.println("Item 1: " + listaSupermercado.getItens()); // vai retornar o toString

		System.out.println("Total que foi pago: " + listaSupermercado.calcularTotalPago());
		System.out.println("Total pendente: " + listaSupermercado.calcularTotalPendente());
		System.out.println("Total geral do mês: "
				+ (listaSupermercado.calcularTotalPago() + listaSupermercado.calcularTotalPendente()));
	}

}
