package execao.personalizadaA;

import streamApi.Aluno;

public class Validar {
    private Validar(){}

    public static void aluno(Aluno aluno){
        if (aluno == null){
            throw new IllegalArgumentException();
        }
        if (aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("nome");
        }
        if (aluno.nota <0){
            throw new NumeroNegativoException("nota");
        }
    }
}
