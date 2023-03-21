package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> mediaCalc = (x, y) -> (x+y)/2;
		System.out.println(mediaCalc.apply(10.0, 8.0));
		UnaryOperator<Double> pontoExtra = x -> x+1;
		System.out.println("Media com ponto extra " + mediaCalc.andThen(pontoExtra).apply(10.0, 8.0));
		BiFunction<Double, Double, String> passou = (x,y) -> (x+y)/2 >= 7.0 ? "passou" : "reprovou";
		
		System.out.println(passou.apply(7.9, 6.0));
	}
}
