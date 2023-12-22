package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Conta;
import ecommerce.model.Produto;
import ecommerce.repository.produto.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	private int numero = 0;

	@Override
	public void cadastrar(Produto produto) {
		numero++;
		produto.setNumero(numero);
		listaProdutos.add(produto);
		System.out.println("\nO produto número: " + produto.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void listarTodas() {
	}

	@Override
	public void deletar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

}
