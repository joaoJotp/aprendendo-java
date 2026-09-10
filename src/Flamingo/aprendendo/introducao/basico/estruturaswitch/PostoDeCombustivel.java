package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.basico.estruturaswitch;

import java.util.Scanner;

public class PostoDeCombustivel {
    static void main(String[] args) {
        byte tipoCombustivel;
        float litros, preco;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Qual o tipo de combustivel?
                
                1)Gasolina
                2)Etanol
                3)Diesel
                """);
        tipoCombustivel = sc.nextByte();
        String resultado;

        switch (tipoCombustivel){
            case 1:
                System.out.printf("Quantos litros de Gasolina você deseja?");
                litros = sc.nextFloat();
                preco = litros * 5.89f;

                resultado = "Preço total do combustivel é R$" + preco;
                break;
            case 2:
                System.out.printf("Quantos litros de Etanol você deseja?");
                litros = sc.nextFloat();
                preco = litros * 3.99f;

                resultado = "Preço total do combustivel é R$"+ preco;
                break;
            case 3:
                System.out.printf("Quantos litros de Diesel você deseja?");
                litros = sc.nextFloat();
                preco = litros * 6.19f;

                resultado = "Preço total do combustivel é R$" + preco;
                break;
            default:
                resultado = "Não existe essa opção";
                break;
        }
        System.out.printf(resultado);
        sc.close();
    }
}
