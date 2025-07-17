package maiscodigos_polimorfismo;

public class PagamentoCartao extends Pagamento {
	
	@Override
	public void realizarPagamento() {
		System.out.println("Pagamento realizado com cartão.");
	}
}
