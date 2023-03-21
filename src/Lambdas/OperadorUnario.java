package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> mais2 = x -> x+2;
		UnaryOperator<Integer> vezes2 = x -> x*2;
		UnaryOperator<Integer> ao2 = x -> x*x;
		
		System.out.println(mais2.andThen(vezes2).andThen(ao2).apply(2));
		System.out.println(ao2.compose(vezes2).compose(mais2).apply(2));
	}
}
