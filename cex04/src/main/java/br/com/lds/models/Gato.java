package br.com.lds.models;

public class Gato extends Animal {

	public Gato() {
		setCor("Branco");

	}

	public Gato(String cor) {
		setCor(cor);

	}

	@Override
	public void som() {
		// super chama a implementa��o da m�e
		super.som();

		System.out.println("Eu gosto de miar");
	}

	public void oQueEuFacoDuranteANoite() {
		System.out.println("Gosto de pular a cerca toda noite");

	}
}