package ecommerce.model;

public class Cliente extends Conta {
	
	
	private String email;
	private String endereco;
	private String telefone;
	
	public Cliente(int numero, String senha, String usuario, String nome, String email, String endereco,
			String telefone) {
		super(numero, senha, usuario, nome);
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public void sobre() {
		System.out.println("Cliente : " + this.getNome());
		
	}

	
	
	
	


}
