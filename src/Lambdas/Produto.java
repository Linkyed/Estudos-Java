package Lambdas;

public class Produto {
	final private String nome;
	final private double valor;
	final private char sessao;
	
	public Produto(String nome, double valor, char sessao) {
		this.nome = nome;
		this.valor = valor;
		this.sessao = sessao;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public char getSessao() {
		return sessao;
	}
	
}
