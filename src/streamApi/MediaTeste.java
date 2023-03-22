package streamApi;

public class MediaTeste {
	public static void main(String[] args) {
		Media m1 = new Media();
		Media m2 = new Media().adicionar(8.0).adicionar(6);
		m1.adicionar(8).adicionar(6.5).adicionar(3.7);
		
		System.out.println(Media.combinar(m1, m2).getValor());
	}
}
