package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce1 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Jose", 4.65, false);
		Aluno a2 = new Aluno("Bia", 8, true);
		Aluno a3 = new Aluno("Joao", 9, true);
		Aluno a4 = new Aluno("Pedro", 3.65, false);
		Aluno a5 = new Aluno("Josefina", 1.65, false);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		Predicate<Aluno> aprovador = n -> n.nota >=7;
		Function<Aluno, Double> apenasNota = n -> n.nota;
		BinaryOperator<Double> somatorio = (a, b) -> a+b;
		
		Double a = alunos.stream().filter(aprovador).map(apenasNota).reduce(somatorio).get();
		
		System.out.println(a);
		
	}
}
