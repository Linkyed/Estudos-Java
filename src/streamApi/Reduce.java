package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, x) -> ac+x;
		
		System.out.println(numeros.stream().reduce(soma).get());
		
	}
}
