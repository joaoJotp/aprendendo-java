package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio25 {
    static void main(String[] args) {
        int xp = 10000;
        String res;

        if (xp < 1000){
            res ="Iniciante";
        } else if (xp < 5000) {
            res = "Intermediario";
        } else if (xp < 1000) {
            res = "Avançado";
        }else {
            res = "lendario";
        }
        System.out.println(res);
    }
}
