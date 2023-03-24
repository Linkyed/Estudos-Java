package execao.personalizadaB;

public class StringVaziaException extends Exception{
    String nomeAtributo = null;

    public StringVaziaException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo e %s esta vaio", nomeAtributo);
    }
}
