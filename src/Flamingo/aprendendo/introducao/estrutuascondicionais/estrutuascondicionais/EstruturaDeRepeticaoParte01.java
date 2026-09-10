package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.estrutuascondicionais.estrutuascondicionais;

import java.util.Scanner;

public class EstruturaDeRepeticaoParte01 {
    static void main(String[] args) {
        // for
        // while
        // do while

        // contador = contador +1
        // contador += 1;
        // contador++

        //for(int contador = 0; contador <= 10; contador++){
        //    System.out.println(contador);
        //}
        int numero ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero desejado");
        numero = sc.nextInt();

        for(int contador = 1; contador <= 10; contador ++){
            System.out.println(numero + "x" + numero + "=" + (numero * contador));
        }
    }
}
