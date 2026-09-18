package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.basico.estruturaswitch.exerciciosArray;

import java.util.Scanner;

public class Ex003 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [] numero = new int[5];
        int soma = 0;

        for(int i = 0; i < numero.length; i++){
            System.out.println("Digite um numero: ");
            numero[i] = sc.nextInt();
            soma += numero[i];
        }
        System.out.println(soma);
        sc.close();
    }
}
