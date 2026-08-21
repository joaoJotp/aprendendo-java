package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio23 {
    static void main(String[] args) {
        int salario = 2200;

        String res;

        if (salario <= 1500){
            res = "Salario baixo";
        } else if (salario <= 3000) {
            res = "Salario medio";
        }else if (salario <= 7000){
            res = "Salario bom";
        }else {
            res = "Salario alto";
        }
        System.out.println(res);
    }
}
