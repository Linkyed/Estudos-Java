package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTesteLambda {
	public static void main(String[] args) {
		//Usando uma interface criada agora
		Calculo calculo = (x, y) -> {return x + y;};
		System.out.println(calculo.executar(3, 5));
		calculo = (x, y) -> x/y;
		System.out.println(calculo.executar(3, 5));
		
		//Usando uma interface do proprio java
		BinaryOperator<Double> calc = (x,y) -> x-y;
		System.out.println(calc.apply(4.0, 2.0));
		
	}
}
