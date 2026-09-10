package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio45 {
    static void main() {
        double valorCompra = 1000;
        double valor5descontototal = valorCompra * 0.95;
        double valor10descontototal = valorCompra * 0.90;
        double valor15descontototal = valorCompra * 0.85;
        double valor5desconto = valorCompra / 100 * 5;
        double valor10desconto = valorCompra / 100 * 10;
        double valor15desconto = valorCompra / 100 * 15;
        String resultado;
        if(valorCompra <= 100){
            resultado = "Você não tem desconto porque seu valor não passa de R$ 100,00 " + valorCompra;
        } else if (valorCompra >= 101 && valorCompra <= 300) {
            resultado = "Você tem 5% de desconto, o valor original é " + valorCompra + "O valor do desconto é " + valor5desconto + "O valor total com desconto é " + valor5descontototal;
        } else if (valorCompra >= 301 && valorCompra <= 500) {
            resultado = "Você tem 10% de desconto, o valor original é " + valorCompra + "O valor do desconto é " + valor10desconto + "O valor total com desconto é " + valor10descontototal;
        }else if (valorCompra > 500){
            resultado = "Você tem 15% de desconto, o valor original é " + valorCompra + "O valor do desconto é " + valor15desconto + "O valor total com desconto é " + valor15descontototal;
        }else{
            resultado = " ";
        }

        System.out.println(resultado);
    }
}
