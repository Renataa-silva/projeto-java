package ecommerce.model;

import java.util.ArrayList;

public class Carrinho {
	
	private Cliente cliente;
	private ArrayList<Pedido> listaPedidos;
	
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
	

}
