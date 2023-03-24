package execao.personalizadaA;

public class NumeroNegativoException extends RuntimeException{
    String nomeAtributo = null;

    public NumeroNegativoException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo e %s esta negativo", nomeAtributo);
    }
}
