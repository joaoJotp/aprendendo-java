package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio22 {
    static void main(String[] args) {
        int nota = 10;
        String res;

        if (nota >= 9){
            res = "Excelente";
        } else if (nota >= 7) {
            res = "Bom";
        } else if (nota >= 5) {
            res = "Recuperação";
        }else {
            res = "Reprovado";
        }
        System.out.println(res);
    }
}
