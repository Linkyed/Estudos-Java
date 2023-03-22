package streamApi;

public class Media {
	private double total;
	private int quantidade;
	
	public Media adicionar(double valor) {
		total += valor;
		quantidade++;
		return this;
	}
	
	public double getValor() {
		return total/quantidade;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultando = new Media();
		resultando.quantidade = m1.quantidade + m2.quantidade;
		resultando.total = m1.total + m2.total;
		
		return resultando;
	}
}
