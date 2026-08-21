package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio20 {
    static void main(String[] args) {
        boolean temPermissao = false;
        String res;

        if (temPermissao){
            res = "Acesso liberado";
        }else{
            res = "Acesso negado";
        }
        System.out.println(res);
    }
}
