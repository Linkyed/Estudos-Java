package Lambdas;

public class Produto {
	final public String nome;
	final public double valor;
	final public char sessao;
	final public double desconto;
	
	public Produto(String nome, double valor, char sessao, double desconto) {
		this.nome = nome;
		this.valor = valor;
		this.sessao = sessao;
		this.desconto = desconto;
	}
	public Produto(String nome, double valor, char sessao) {
		this.nome = nome;
		this.valor = valor;
		this.sessao = sessao;
		this.desconto = 0;
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
