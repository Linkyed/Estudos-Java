package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		//Usando um predicate para verificar se um produto é caro ou não
		Predicate<Produto> isCaro = prod -> prod.getValor() > 500;
		
		Produto produto = new Produto("Computador", 1500, 'A');
		
		System.out.println(isCaro.test(produto));
	}
}
