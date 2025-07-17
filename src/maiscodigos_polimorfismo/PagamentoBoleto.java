package maiscodigos_polimorfismo;

public class PagamentoBoleto extends Pagamento{

	@Override
	public void realizarPagamento() {
		System.out.println("Pagamento realizado com boleto.");
	}
}
