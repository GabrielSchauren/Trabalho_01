package fag;

import java.util.ArrayList;
import java.util.Scanner;

import fag.objetos.Produto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produtos = new Produto();
		ArrayList<Produto> produtos1 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
			
		int escolha;
		
		do {
			System.out.println("\nmenu");
			System.out.println("1 adicionar um produto");
			System.out.println("2 mostrar lista dos produtos cadastrados");
			System.out.println("3 sair ");
			System.out.println("Escolha uma opção: ");
			escolha = scanner.nextInt();
			
			switch (escolha) {
			
			case 1:
				System.out.println("Digite o nome do produto, preço do produto, quantidade dos produtos");
				produtos1.add(new Produto(scanner.next(),scanner.nextDouble(),scanner.nextInt()));
				break;
			
			case 2:
				System.out.println("Lista de produtos");
				if (produtos1.isEmpty()) {
					System.out.println("Produtos não cadastrados!!!");
				}
				else {
					for (Produto produto : produtos1) {
						System.out.println(produto);
						
					}
				}
				break;
			case 3:
				System.out.println("Obrigado!!!");
				break;
				
			default:
				System.out.println("Erro");
				break;
			
			}
		}while(escolha != 3);
		
		
		
		
		
	}

}
