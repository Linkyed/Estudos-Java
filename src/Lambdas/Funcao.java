package Lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = x -> x%2 == 0 ? "par" : "mpar";
		Function<String, String> oResultadoE = resultado -> "O resutlado é: " + resultado;
		System.out.println(parOuImpar.andThen(oResultadoE).apply(36));
	}
}
