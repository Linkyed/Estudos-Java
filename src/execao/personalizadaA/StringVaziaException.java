package execao.personalizadaA;

public class StringVaziaException extends RuntimeException{
    String nomeAtributo = null;

    public StringVaziaException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo e %s esta vaio", nomeAtributo);
    }
}
