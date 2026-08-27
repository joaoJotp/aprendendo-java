package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio27 {
    static void main(String[] args) {
        byte codigoPedido = 0;

        String res;

        if (codigoPedido == 1){
            res = "Eletronico";
        } else if (codigoPedido == 2) {
            res = "Alimento";
        } else if (codigoPedido == 3) {
            res = "Roupa";
        }else if (codigoPedido == 4){
            res = "Livro";
        }else {
            res = "Categoria invalida";
        }
        System.out.println(res);
    }
}
