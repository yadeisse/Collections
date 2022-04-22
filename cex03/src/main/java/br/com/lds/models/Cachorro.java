package br.com.lds.models;

public class Cachorro extends Animal {

	public Cachorro(String nome) {

		setNome(nome);

	}

	// annotation
	// adiciona metadados ao nosso metodo
	@Override
	public void som() {
		super.som();
		// caos tenha a necessidade de chamar a implementação da mãe, basta chamar o
		// metodo com super "super.som();

		System.out.println("Eu gosto de latir");
	}

	public void oQueEuGostoDeFazer() {

		System.out.println("Gosto de morder os carteiros");
	}

}