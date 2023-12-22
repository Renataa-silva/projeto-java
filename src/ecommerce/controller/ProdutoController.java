package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Conta;
import ecommerce.model.Produto;
import ecommerce.repository.produto.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	
	public void inicializar() {
		cadastrar(new Produto("Vestido Rodado cor:Esmeralda", 130.0f, 0));
		cadastrar(new Produto("Vestido Midi cor:Nude", 130.0f, 0));
		cadastrar(new Produto("Camisa Polo Feminina cor:Branco", 92.0f, 0));
		cadastrar(new Produto("Camisa Polo Feminina cor: Azul Claro", 92.0f, 0));
		cadastrar(new Produto("Calça Alfaiataria cor: Preto", 256.0f, 0));
		
	}
	
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
		for (Produto produto : listaProdutos) {
		System.out.println("Código: " + produto.getNumero() + " | Nome: " + produto.getNome() + " | Valor: R$ " + produto.getValor());
		}
	}

	@Override
	public void deletar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return produto;
			}
		}return null;
	}

}
