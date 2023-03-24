package streamApi;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Jose", 9, false);
		Aluno a2 = new Aluno("Bia", 8, true);
		Aluno a3 = new Aluno("Joao", 9, true);
		Aluno a4 = new Aluno("Pedro", 9.65, false);
		Aluno a5 = new Aluno("Josefina", 10, false);
        Aluno a6 = new Aluno("carlos", 5.67, true);
		Aluno a7 = new Aluno("Josivaldo", 7.65, false);
		Aluno a8 = new Aluno("Josefinaril", 3.78, false);
        Aluno a9 = new Aluno("carlos", 5.67, true);
		Aluno a10 = new Aluno("Josivaldo", 7.65, false);
		Aluno a11 = new Aluno("Josefinaril", 3.78, false);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11);


        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream().distinct()
        .skip(2)
        .limit(2)
        .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream().distinct()
        .takeWhile(a -> a.nota >= 7)
        .forEach(System.out::println);
    }
}
