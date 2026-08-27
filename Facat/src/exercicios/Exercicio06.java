package exercicios;


import java.util.Scanner;

public class Exercicio06 {
    static void main(String[] args) {
        double altura, base, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Base do retângulo");
        base = sc.nextDouble();

        System.out.println("Digite a Altura do retângulo");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf("A Area do retângulo = %.2f", area);
        sc.close();
    }
}

