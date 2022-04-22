package br.com.lds;

import java.util.ArrayList;
import java.util.List;

import br.com.lds.models.Animal;
import br.com.lds.models.Cachorro;
import br.com.lds.models.Gato;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	public void start() {

		Cachorro primeiroCachorro = new Cachorro("Tiburssinho");
		Cachorro segundoCachorro = new Cachorro("Aroldo");

		primeiroCachorro.setCor("Azul");

		List<Cachorro> cachorros = new ArrayList<Cachorro>();

		cachorros.add(primeiroCachorro);
		cachorros.add(segundoCachorro);

		for (Cachorro cachorro : cachorros) {

			cachorro.som();
			cachorro.dizerMeuNome();
			cachorro.dizerMinhaIdade();
			cachorro.oQueEuGostoDeFazer();

			System.out.println("Cor do cachorro: " + cachorro.getCor());
			System.out.println("---------------");

		}

		Gato primeiroGato = new Gato();
		Gato segundoGato = new Gato("Verde");

		List<Gato> gatos = new ArrayList<Gato>();
		gatos.add(primeiroGato);
		gatos.add(segundoGato);

		for (Gato gato : gatos) {

			gato.som();
			gato.dizerMeuNome();
			gato.dizerMinhaIdade();
			gato.oQueEuFacoDuranteANoite();

			System.out.println("Cor do gato: " + gato.getCor());
			System.out.println("------------");

		}

	}

	private void exemploQueFoiDadoDuranteAAula() {

		Animal cachorro = new Cachorro("tiburssinho");
		Animal gato = new Gato();
		Cachorro segundoCachorro = new Cachorro("Aroldo");

		cachorro.som();
		cachorro.dizerMeuNome();
		cachorro.dizerMinhaIdade();
		((Cachorro) cachorro).oQueEuGostoDeFazer();

		System.out.println("-----------------------");

		segundoCachorro.oQueEuGostoDeFazer();

		System.out.println("-----------------------");

		gato.som();
		gato.dizerMeuNome();
		gato.dizerMinhaIdade();
		System.out.println("Cor do primeiro gato" + gato.getCor());

		System.out.println("-----------------------");

		Animal segundoGato = new Gato("Azul");
		System.out.println("Cor do segundo gato" + segundoGato.getCor());

	}
}