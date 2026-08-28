package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.basico.estruturaswitch;

import java.util.Scanner;

public class CardapioLanchonete {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcaoLanche;
        double quantidade, preco;

        System.out.println("""
                Escolha uma opção:
                
                1)Hamburguer
                2)Pizza
                3)batata frita
                4)Refrigerante
                5)Suco
                """);
        opcaoLanche = sc.nextByte();
        String resultado;
        switch (opcaoLanche){
            case 1:
            System.out.print("Quantos hamburgueres vc deseja?");
            quantidade = sc.nextDouble();
            preco = quantidade * 25;

            resultado = "O valor a pagar é" + preco;
            break;
            case 2:
                System.out.println("Quantas Pizzas vc deseja?");
                quantidade = sc.nextDouble();
                preco = quantidade * 40;

                resultado = "o valor a pagar é" + preco;
                break;
            case 3:
                System.out.println("Quantas batatas fritas vc deseja?");
                quantidade = sc.nextDouble();
                preco = quantidade * 18;

                resultado = "o valor a pagar é" + preco;
                break;
            case 4:
                System.out.println("Quantos refrigerantes vc deseja?");
                quantidade = sc.nextDouble();
                preco = quantidade + 8;

                resultado = "o valor a pagar é" + preco;
                break;
            case 5:
                System.out.println("Quantos sucos vc deseja?");
                quantidade = sc.nextDouble();
                preco = quantidade + 10;

                resultado = "o valor a pagar é" + preco;
                break;
            default:
                System.out.println("O valor informado é invalido");
                break;
        }
        System.out.println(resultado);
        sc.close();
    }
}
