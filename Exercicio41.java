package src.Flamingo.aprendendo.introducao.basico.exercicios.estrutuascondicionais;

public class Exercicio41 {
    static void main(String[] args) {
        int nota = 0;
        int presenca= 2;

        String res;
        if (nota >= 7 && presenca >= 75){
            res = "Aprovado";
        } else if (nota >= 5 && presenca < 75) {
            res = "Recuperação";
        }else {
            res = "Reprovado";
        }
        System.out.println(res);
    }
}
