package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio30 {
    static void main(String[] args) {
        int tipoCliente = 2;
        double compra = 100.00;
        double descontoBronze = compra * 0.5;
        double descontoPrata = compra * 0.9;
        double descontoOuro = compra * 0.15;
        String res;




        if (tipoCliente == 1){
            res = "cliente comum — desconto de 0%";
        } else if (tipoCliente == 2) {
            res = "cliente bronze — desconto de 5% " * descontoBronze;
        } else if (tipoCliente == 3) {
            res = " cliente prata — desconto de 10%" ;
        } else if (tipoCliente == 4) {
            res = " cliente ouro — desconto de 15%";
        }else {
            res = "Você não é cliente";
        }
        System.out.println(compra );
    }
}
