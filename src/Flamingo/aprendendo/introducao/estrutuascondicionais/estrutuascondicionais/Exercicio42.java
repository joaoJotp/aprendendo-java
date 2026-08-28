package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.estrutuascondicionais.estrutuascondicionais;

public class Exercicio42 {
    static void main(String[] args) {
        int saldo = 101;
        int valorProduto = 100;
        boolean clienteVip = false;
        
        String res;

        if (saldo >= valorProduto){
            res = "Compra Aprovada";
        } else if (saldo < valorProduto && clienteVip) {
            res = "Compra aprovada pelo crédito VIP";
        }else{
            res = "Compra recusada";
        }
        System.out.println(res);
    }
}
