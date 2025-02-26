package br.com.petshop;

public class Cachorro extends Animal {
	private string raça;
	
	public Cachorro(string nome, int idade, string raça) {
		super(nome,idade);
		this.raça = raça;
		
		
	}
	
public void latir() {
	System.out.println(getNome() +" está latindo: Au Au!");
	
}
}
