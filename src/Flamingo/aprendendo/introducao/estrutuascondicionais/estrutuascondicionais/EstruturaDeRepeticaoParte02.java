package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.estrutuascondicionais.estrutuascondicionais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstruturaDeRepeticaoParte02 {
    static void main(String[] args) {
        //for
        // while
        // do while
        int numeroTabuada ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero desejado");
        numeroTabuada = sc.nextInt();
        int contador = 1;
        while (contador <= 10){
            System.out.println(contador + "x" + contador + "=" + (contador * numeroTabuada));

            contador++;
        }
    }
}
