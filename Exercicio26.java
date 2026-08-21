package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio26 {
    static void main(String[] args) {
        int statusPedido = 3;

        String res;

        if (statusPedido == 1){
            res = "Pedido recebido";
        } else if (statusPedido == 2) {
            res = "Pedido em preparação";
        } else if (statusPedido == 3) {
            res = "Pedido enviado";
        } else if (statusPedido == 4) {
            res = "Pedido entregue";
        } else  {
            res = "Status invalido";
        }
        System.out.println(res);
    }
}
