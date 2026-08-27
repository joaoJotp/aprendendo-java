package src.Flamingo.aprendendo.introducao.basico.exercicios.estrutuascondicionais;

public class Exercicio39 {
    static void main(String[] args) {
        double valorCompra = 70.0;

        double valorFrete = (valorCompra >= 150)? 0.0 : 20.0 ;
        System.out.println(valorFrete);
    }
}
