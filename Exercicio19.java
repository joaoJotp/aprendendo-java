package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio19 {
    static void main(String[] args) {
        int valorCompra = 150;
        String res;

        if (valorCompra >= 150){
            res = "Frete Gratis";
        }else{
            res = "Frete R$ 20.00";
        }
        System.out.println(res);
    }
}
