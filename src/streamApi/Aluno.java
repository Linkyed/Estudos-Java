package streamApi;

public class Aluno {
	final String nome;
	final double nota;
	final boolean bomComportamento;
	public Aluno(String nome, double nota, boolean bomComportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	
	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = false;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "aluno " + nome + " e nota " + nota;
	}
	
	
	
}
