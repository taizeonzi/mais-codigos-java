package maiscodigos_generics;

import java.util.Objects;

//Usando generics para fazer um sistema de controle financeiro

public class Item { // itens a serem pagos
	private String nome;
	private double preco;
	private boolean status;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, preco, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco) && status == other.status;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", status=" + status + "]";
	}

}