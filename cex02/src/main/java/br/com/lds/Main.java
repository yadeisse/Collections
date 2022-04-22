package br.com.lds;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private Map<String, String> mapa = new HashMap<String, String>();

	public void start() {

		adicionarItensNoMapa();
		interarMapa();

		exibirValorDoMapaPelaChave("SRS");
		exibirValorDoMapaPelaChave("MG");

		mapa.put("SRS", "Santa Rita");
		interarMapa();

	}

	private void adicionarItensNoMapa() {

		mapa.put("SRS", "Santa Rita do Sapucai");
		mapa.put("PA", "Pouso Alegre");
		mapa.put("ITA", "Itajuba");
		mapa.put("ZORO", "Conceicao dos Ouros");
		mapa.put("CAXU", "Cachoeira de Minas");
	}

	private void interarMapa() {
		for (String chave : mapa.keySet()) {
			String valor = mapa.get(chave);

			System.out.println("Chave: " + chave + "| Valor: " + valor);

		}
	}

	private void exibirValorDoMapaPelaChave(String chave) {

		try {

			if (mapa.containsKey(chave)) {
				String valor = mapa.get(chave);
				System.out.println("Valor: " + valor);
			} else {
				System.out.println("Chave" + chave + " não existe ");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Ocorreu um erro");

		} finally {
			System.out.println("--------------");
		}
	}

}
