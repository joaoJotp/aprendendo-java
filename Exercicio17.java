package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio17 {
    static void main(String[] args) {
        byte idade = 17;
        boolean temCNH = true;
        String res;

        if (idade >= 18 && temCNH){
            res = "Pode dirigir";
        }else {
            res = "Não pode dirigir";
        }
        System.out.println(res);

    }
}
