package ecommerce.model;

public class Vendedor extends Conta {

	
	public Vendedor(int numero, String senha, String usuario, String nome) {
		super(numero, senha, usuario, nome);
		
	}

	@Override
	public void sobre() {
		System.out.println("Vendedor: " + this.getNome());
		
	}
	
	

	
	

}
