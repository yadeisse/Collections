package br.com.lds.models;

public class Animal {

	private int id;
	private String nome;

	private static int ID_UNICO = 0;

	protected void incrementarIdUnico() {

		ID_UNICO += 1;
	}

	public int getIdUnico() {
		return ID_UNICO;
	}

}
