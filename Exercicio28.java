package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio28 {
    static void main(String[] args) {
        byte plano = 1;
        String res;

        if (plano == 1){
            res = "Plano Básico - R$ 29,90";
        } else if (plano == 2) {
            res = "Plano Intermediário - R$ 59,90";
        } else if (plano == 3) {
            res = "Plano Premium - R$ 99,90";
        }else {
            res = "Plano invalido";
        }
        System.out.println(res);
    }
}
