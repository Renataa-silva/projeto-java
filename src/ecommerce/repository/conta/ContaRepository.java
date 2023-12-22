package ecommerce.repository.conta;

import ecommerce.model.Conta;


public interface ContaRepository {
	
	public void cadastrar(Conta conta);
	public void listarTodas();
	public void deletar(Conta conta);
	public void atualizar(Conta conta);
	public Conta login(String usuario, String senha);
	

}
