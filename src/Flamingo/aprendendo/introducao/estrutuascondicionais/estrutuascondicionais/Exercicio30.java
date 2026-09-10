package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio30 {
    static void main() {
        int TipoCliente = 5;
        double numero1 = 1;
        double numero2 = 2;
        double numero3 = 3;
        double numero4 = 4;
        double ValorCompra = 1500.00f;
        double ClienteComun = ValorCompra;
        double ClienteBronze = ValorCompra * 0.95;
        double ClientePrata = ValorCompra * 0.90;
        double ClienteOuro = ValorCompra * 0.85;
        String resultado;


        if (TipoCliente == numero1){
            resultado = "Você é um cliente comum você não possui desconto, o valor total deu" + ClienteComun;
        } else if (TipoCliente == numero2) {
            resultado = "Você é um cliente bronze você possui 5% de desconto, o valor total com desconto deu " + ClienteBronze;
        } else if (TipoCliente == numero3) {
            resultado = "Você é um cliente prata você possui 10% de desconto, o valor total com desconto deu " + ClientePrata;
        } else if (TipoCliente == numero4) {
            resultado = "Você é um cliente ouro você possui 15% de desconto, o valor total com desconto deu " + ClienteOuro;
        } else {
            resultado = "Código invalido";
        }
        System.out.println(resultado);


    }
}
