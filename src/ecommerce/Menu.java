package ecommerce;

import java.util.Scanner;

import ecommerce.controller.ContaController;
import ecommerce.model.Cliente;
import ecommerce.model.Conta;

public class Menu {

	static Scanner leia = new Scanner(System.in);
	static ContaController contas = new ContaController();
	
	
	public static void main(String[] args) {
		
		String nome;
		String endereco;
		String telefone;
		String email;
		String usuario;
		String senha;
		

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     Moda Store                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Login                                ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nModa Store - Vestindo seus sonhos!");

				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
				
				System.out.println("Digite o Usuario: ");
				usuario = leia.next();
				System.out.println("Digite a Senha: ");
				senha = leia.next();				
				System.out.println("Digite o Nome: ");
				nome = leia.next();
				System.out.println("Digite o Email: ");
				email = leia.next();
				System.out.println("Digete o Endereço: ");
				endereco =leia.next();
				System.out.println("Digite o Telefone");
				telefone = leia.next();
				
				contas.cadastrar(new Cliente(0, senha, usuario, nome, email, endereco, telefone));
				break;
			case 2:
				System.out.println("Login\n\n");
				var conta = menulogin();
				
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}

		}

	}

	public static Conta menulogin() {
		String usuario;
		String senha;
		System.out.println("\n*********************************************************");
		System.out.println("Usuario: ");
		usuario = leia.next();
		System.out.println("Senha: ");
		senha = leia.next();
		System.out.println("*********************************************************");
		var conta = contas.login(usuario, senha);
		if (conta == null) {
			System.out.println("Usuario não encontrado!");
		}else {
			System.out.println("Login realizado com sucesso!");
		}
		return conta;
		
	}
	
	
	
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Renata Pereira ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}
	
}
