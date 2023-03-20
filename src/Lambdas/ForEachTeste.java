package Lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEachTeste {
	public static void main(String[] args) {
		//Usando lambda para percorrer uma lista
		List<String> pessoas = Arrays.asList("Junior", "Luan", "Matheus", "Eduardo");
		
		//Primeira forma
		System.out.println("Lambda 0");
		pessoas.forEach(x -> System.out.println(x));
		
		//Segunda forma
		System.out.println("Method Reference 0");
		pessoas.forEach(System.out::println);
		
		//Terceira forma
		System.out.println("Lambda 1");
		pessoas.forEach(pessoa -> imprimir(pessoa));
		
		//Quarta forma
		System.out.println("Method Reference 0");
		pessoas.forEach(ForEachTeste::imprimir);
	}
	
	static void imprimir(String nome) {
		System.out.println("Oi eu sou " + nome);
	}
}
