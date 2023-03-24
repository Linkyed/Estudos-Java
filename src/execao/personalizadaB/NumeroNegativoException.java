package execao.personalizadaB;

public class NumeroNegativoException extends Exception{
    String nomeAtributo = null;

    public NumeroNegativoException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo e %s esta negativo", nomeAtributo);
    }
}
