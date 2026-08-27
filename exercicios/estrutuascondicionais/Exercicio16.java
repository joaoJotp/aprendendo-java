package src.Flamingo.aprendendo.introducao.basico.exercicios.estrutuascondicionais;

public class Exercicio16 {
    static void main(String[] args) {
        double valorCompra = 200;
        double valorDesconto = valorCompra * 0.90;

        if (valorCompra >= 200) {
            System.out.println(valorDesconto);
        }else {
            System.out.println(valorCompra);
        }

    }
}
