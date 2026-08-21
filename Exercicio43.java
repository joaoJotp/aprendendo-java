package src.Flamingo.aprendendo.introducao.basico.exercicios.estrutuascondicionais;

public class Exercicio43 {
    static void main(String[] args) {
        int idade = 25;
        boolean carterinhaEstudante = false;

        String resultado = (idade < 12 || carterinhaEstudante)? "Paga meia" : "Paga inteira";
        System.out.println(resultado);

    }
}
