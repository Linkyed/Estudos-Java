package streamApi.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Consumer<Object> print = System.out::println;
		lista.stream().map(n -> Integer.toBinaryString(n))
		.map(s -> new StringBuilder(s).reverse().toString())
		.map(s -> Integer.parseInt(s, 2)).forEach(print);;
		
		/*
		 * * 1. Número para string binaria... 6 => "110"
		 * 2. Inverter a string... "110" => "611"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
	}
}
