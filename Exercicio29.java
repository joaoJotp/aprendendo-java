package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

import java.sql.SQLOutput;

public class Exercicio29 {
    static void main(String[] args) {
        float imc = 18.4f;
        String res;

        if (imc < 18.5){
            res = "Abaixo do peso";
        } else if (imc < 24.9) {
            res = "Peso normal";
        } else if (imc < 29.9) {
            res = "Sobrepeso";
        }else{
            res = "Obesidade";
        }

        System.out.println(res);
    }
}
