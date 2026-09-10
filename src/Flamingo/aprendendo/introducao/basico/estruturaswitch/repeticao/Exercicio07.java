package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.basico.estruturaswitch.repeticao;

import java.util.Scanner;

public class Exercicio07 {
    static void main(String[] args) {

        int quantidadeVendas ;
        double valorVenda ;
        double faturaMentoTotal = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de vendas");
        quantidadeVendas = sc.nextInt();
        System.out.println("Digite o valor da venda");
        valorVenda = sc.nextInt();

        for(int numero = 1; numero <= quantidadeVendas; numero++){
            faturaMentoTotal += valorVenda;
        }
        System.out.println("Quantidade de vendas " + quantidadeVendas);
        System.out.println("Faturamento total " + faturaMentoTotal);
    }
}
