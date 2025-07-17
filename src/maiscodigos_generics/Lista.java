package maiscodigos_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lista {
	private int mes;
	private double totalPago;
	private double totalPendente;

	private List<Item> itens = new ArrayList<Item>();

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}

	public double getTotalPendente() {
		return totalPendente;
	}

	public void setTotalPendente(double totalPendente) {
		this.totalPendente = totalPendente;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	// métodos para gerenciamento do que foi pago e do que está pendente
	public double calcularTotalPago() {

		double somatoria = 0;

		for (Item item : itens) {
			if (item.isStatus()) {
				somatoria = somatoria + item.getPreco();
			}
		}

		return somatoria;
	}

	public double calcularTotalPendente() {

		double somatorio = 0;

		for (Item item : itens) {
			if (item.isStatus() != true) {
				somatorio = somatorio + item.getPreco();
			}
		}

		return somatorio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itens, mes, totalPago, totalPendente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lista other = (Lista) obj;
		return Objects.equals(itens, other.itens) && mes == other.mes
				&& Double.doubleToLongBits(totalPago) == Double.doubleToLongBits(other.totalPago)
				&& Double.doubleToLongBits(totalPendente) == Double.doubleToLongBits(other.totalPendente);
	}

	@Override
	public String toString() {
		return "Lista [mes=" + mes + ", totalPago=" + totalPago + ", totalPendente=" + totalPendente + ", itens="
				+ itens + "]";
	}
}
