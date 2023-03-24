package execao.personalizadaA;

import streamApi.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("", 10);
            Validar.aluno(aluno);

        } catch (StringVaziaException e){
            System.out.println(e.getMessage());
        } catch (NumeroNegativoException e){
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("O objeto 'aluno' está nulo");
        }
        System.out.println("Fim.");
    }
}
