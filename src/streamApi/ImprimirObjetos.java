package streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Bia", "Pedro", "Ana", "Marcelo");
		
		System.out.println("ForEach");
		for (String nome : lista) {
			System.out.println("Aprovador: " + nome);
		}
		
		System.out.println("\nIterator");
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			System.out.println("Aprovados: " + it.next());
		}
		
		System.out.println("\nStream");
		Stream<String> st = lista.stream();
		st.forEach(System.out::println);
	}
}
