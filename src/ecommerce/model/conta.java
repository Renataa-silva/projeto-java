package ecommerce.model;

public abstract class Conta {
	
	private int numero;
	private String senha;
	private String usuario;
	private String nome;
	public Conta(int numero, String senha, String usuario, String nome) {
		super();
		this.numero = numero;
		this.senha = senha;
		this.usuario = usuario;
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void visualizar();
	
	
	

}
