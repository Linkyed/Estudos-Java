package Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = x -> x%2 == 0;
		Predicate<Integer> tem3Digitos = x -> x >= 100 && x <=999;
		
		System.out.println(isPar.and(tem3Digitos).test(998));
		System.out.println(isPar.or(tem3Digitos).test(9999));
	}
}
