package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto a = new CaixaObjeto();
		a.guardar(22.3);
		
		Double coisaA = (Double) a.abrir();
		
		System.out.println(coisaA);
		
		CaixaObjeto b = new CaixaObjeto();
		b.guardar("AAA");
		
		String coisaB = (String) b.abrir();
		
		System.out.println(coisaB);
	}
}
