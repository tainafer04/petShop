package br.com.petshop;
	
	import java.util.ArrayList;
	import java.util.Scanner;

public class PetShop {
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>();
		int opcao;
		
		do {
			System.out.println("\n === Menu ===");
			System.out.println("1- Cadastrar Cachorro");
			System.out.println("2- Cadastrar Gato");
			System.out.println("3- Exibir Animal");
			System.out.println("4- Sair ");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			
			
		}
	}
}
