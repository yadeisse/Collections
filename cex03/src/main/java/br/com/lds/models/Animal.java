package br.com.lds.models;

public abstract class Animal {

	public void som() {
		System.out.println("Este é o som padrão de um animal: zzzzz");
	}

	public void dizerMeuNome() {
		System.out.println("Meu nome eh: " + getNome());
	}

	public void dizerMinhaIdade() {
		System.out.println("Minha idade eh: " + getIdade());

	}

	private String cor = "Preto";
	private int idade = 5;
	private String nome = "Não definido";

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

}