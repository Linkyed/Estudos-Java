package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JavaScript\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "PHP ", "Ruby\n"};
		Arrays.stream(maisLangs).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("Kotlin ", "Lisp ", "Go \n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
	}
}
