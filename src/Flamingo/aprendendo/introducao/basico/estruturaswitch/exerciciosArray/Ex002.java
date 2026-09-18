package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.basico.estruturaswitch.exerciciosArray;

import java.util.Scanner;

public class Ex002 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] idade = new int [6];

        for (int i = 0; i < idade.length; i++){
            System.out.println("Digite a idade da pessoa: ");

            idade[i] = sc.nextInt();
        }
        for (int idades : idade){
            System.out.println(idades);
        }

        sc.close();
    }
}
