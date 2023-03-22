package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Jose", 2, false);
		Aluno a2 = new Aluno("Bia", 8, true);
		Aluno a3 = new Aluno("Joao", 9, true);
		Aluno a4 = new Aluno("Pedro", 9.65, false);
		Aluno a5 = new Aluno("Josefina", 10.65, false);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Comparator<Aluno> melhorNota = (al1, al2) -> {
			if(al1.nota > al1.nota) return 1;
			if (al2.nota > al1.nota) return -1;
			return 0;
		};
		
		Comparator<Aluno> menorNota = (al1, al2) -> {
			if(al1.nota < al1.nota) return 1;
			if (al2.nota < al1.nota) return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
	}
}
