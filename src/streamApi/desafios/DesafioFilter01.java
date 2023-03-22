package streamApi.desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter01 {
	public static void main(String[] args) {
		Carro c1 = new Carro(25000, false, "BMW");
		Carro c2 = new Carro(85000, true, "Mercedes");
		Carro c3 = new Carro(45000, true, "Fiat");
		Carro c4 = new Carro(30000, true, "Gol");
		Carro c5 = new Carro(64000, false, "Ferrari");
		
		List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5);
		
		carros.stream().filter(n -> n.preco >= 35000).filter(n -> n.nacional).map(n -> "O carro " + n.nome + " é nacional").forEach(System.out::println);;
		
	}
}
