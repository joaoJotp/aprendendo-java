package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte dias, meses,idade;
        int diasDeVida;

        System.out.println("Digite a sua idade para descobrir quantos dias você ja viveu");
       idade = sc.nextByte();

        System.out.println("Quantos meses adicionais?");
        meses = sc.nextByte();

        System.out.println("Quantos dias adicionais");
        dias = sc.nextByte();

        diasDeVida = (idade * 365) + (meses + 30) + dias;

        System.out.printf("Você tem &d anos = %d dias de vida." , idade, diasDeVida);
        sc.close();
    }
}
