package maiscodigos_polimorfismo;

public class Main {

	public static void main(String[] args) {
		Pagamento[] pagamentos = {
			new PagamentoCartao(),
			new PagamentoBoleto()
		};

		for (Pagamento pag : pagamentos) {
			pag.realizarPagamento();
		}
	}

}

/*📋 Regras:
1.Crie uma classe abstrata chamada Pagamento com um método realizarPagamento().
2.Crie duas classes filhas:
	PagamentoCartao
	PagamentoBoleto
3.Cada classe deve sobrescrever o método realizarPagamento() com a mensagem correta:
	Cartão: "Pagamento realizado com cartão."
	Boleto: "Pagamento realizado com boleto."
4.No main, crie um array de Pagamento e coloque um PagamentoCartao e um PagamentoBoleto.
5.Use um laço para chamar realizarPagamento() para cada item do array.
*/