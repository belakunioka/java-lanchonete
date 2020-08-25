/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellakunioka
 */
public abstract class Lanche {

	private double precoLanche;
	private double precoFrete;
	private double precoTotal;
	private String nomeCliente;
	private String pedido;

	@Override
	public String toString() {
		return "Lanche: " + pedido + "\nValor: " + precoLanche +
				", Frete: " + precoFrete + "\nTotal R$" + precoTotal;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public int tempoDeEntrega (int distancia) {
		return distancia * 10;
	}

	public double getPrecoLanche() {
		return precoLanche;
	}

	public void setPrecoLanche(double precoLanche) {
		this.precoLanche = precoLanche;
	}

	public double getPrecoFrete() {
		return precoFrete;
	}

	public void setPrecoFrete(double precoFrete) {
		this.precoFrete = precoFrete;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
}
