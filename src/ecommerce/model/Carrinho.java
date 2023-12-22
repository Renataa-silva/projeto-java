package ecommerce.model;

import java.util.ArrayList;

public class Carrinho {
	
	private Cliente cliente;
	private ArrayList<Pedido> listaPedidos = new ArrayList<>();
	
	
	
	public Carrinho() {
		super();
	}

	public Carrinho(Cliente cliente, ArrayList<Pedido> listaPedidos) {
		super();
		this.cliente = cliente;
		this.listaPedidos = listaPedidos;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Pedido> getListaPedidos() {
		return listaPedidos;
	}
	public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	
	public void totalcarrinho() {
		var total = 0.0;
		for (Pedido pedido : listaPedidos) {
		total = total + (pedido.getQuantidade()* pedido.getProduto().getValor());
		
		}
		System.out.println("Total do Carrinho: R$ " + total);
		
	}

}
