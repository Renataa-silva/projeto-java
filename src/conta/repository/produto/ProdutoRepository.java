package conta.repository.produto;

import ecommerce.model.Produto;

public interface ProdutoRepository {

	public void cadastrar (Produto produto);
	public void listarTodas();
	public void deletar (Produto produto);
	public void atualizar(Produto produto);
	
}
