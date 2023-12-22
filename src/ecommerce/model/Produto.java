package ecommerce.model;

public class Produto {
	
	private String nome;
	private float valor;
	private int numero;
	public Produto(String nome, float valor, int numero) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}


}
