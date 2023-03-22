package streamApi;

import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 10);
		Aluno a2 = new Aluno("Ana", 8);
		Aluno a3 = new Aluno("Ana", 0);
		Aluno a4 = new Aluno("Ana", 7);	
		Aluno a5 = new Aluno("Ana", 2);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		alunos.stream().filter(n -> n.nota >= 7).forEach(System.out::println);
		
	}
}
