package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Conta;
import ecommerce.repository.conta.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	private int numero = 0;
	
	
	@Override
	public void cadastrar(Conta conta) {
		numero++;
		conta.setNumero(numero);
		listaContas.add(conta);
		System.out.println("\nA conta número: " + conta.getNumero() + " foi criada com sucesso!");

	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void deletar(Conta conta) {
		var contaAux = buscarNaCollection(conta.getNumero());

		if (contaAux!= null) {
			if (listaContas.remove(contaAux) == true) {
				System.out.println("\nA Conta número: " + " foi deletada com sucesso!");
			} else
				System.out.println("\nA Conta número: " + " não foi encontrada!");
		}

	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());

		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\nA Conta número: " + conta.getNumero() + " foi atualiazada com sucesso!");
		} else
			System.out.println("\nA Conta número: " + conta.getNumero() + " não foi encontrada!");

	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}return null;
	}

	@Override
	public Conta login(String usuario, String senha) {
		for (var conta : listaContas) {
			if (conta.getUsuario().equals(usuario) && conta.getSenha().equals(senha)) {
				return conta;
				
			}
			
		}
		return null;
	}
}
