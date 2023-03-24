package execao;


public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            geraError1();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            geraError2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }

    //Não checada
    public static void geraError1(){
        throw new RuntimeException("Ocorreu um erro legal 1");
    }

    //Checada
    public static void geraError2() throws Exception{
        throw new Exception("Ocorreu um erro legal 2");
    }

}
