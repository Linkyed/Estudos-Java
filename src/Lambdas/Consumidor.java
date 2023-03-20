package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = produto -> System.out.println("O nome do produto é " + produto.getNome());
		Produto produto1 = new Produto("Teclado", 150, 'C');
		imprimir.accept(produto1);
		
		Produto produto2 = new Produto("Mouse", 110, 'C');
		Produto produto3 = new Produto("MousePad", 50, 'C');
		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3);
		produtos.forEach(imprimir);
	}
}
