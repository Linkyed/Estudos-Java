package generics;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Bianca");
		resultadoConcurso.adicionar(2, "Gesus");
		resultadoConcurso.adicionar(2, "Rebeca");
		resultadoConcurso.adicionar(3, "Pedro");
		resultadoConcurso.adicionar(4, "Maria");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(3));
	}
}
