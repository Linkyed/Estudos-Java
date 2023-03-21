package Lambdas.desafios;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import Lambdas.Produto;

public class DesafioOperadorBinario {
	public static void main(String[] args) {
		Produto p = new Produto("Notebook", 4576.236, 'X', 0.20);
		
		BinaryOperator<Double> desconto =(x,y) -> x - (x*y); 
		UnaryOperator<Double> imposto = x -> x >= 2500 ? x+(x*0.085) : x;
		UnaryOperator<Double> frete = x -> x >= 3000 ? x+100 : x+50;
		UnaryOperator<Double> arredondar = x -> Math.round(x*100)/100.0;
		Function<Double, String> formatar = x -> "O valor final do produto é R$" + x;
		
		System.out.println(desconto.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatar).apply(p.valor, p.desconto));
		
		
		
	}
}
