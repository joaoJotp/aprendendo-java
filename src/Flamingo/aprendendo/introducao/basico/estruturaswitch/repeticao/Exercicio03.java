package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.basico.estruturaswitch.repeticao;

import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args) {
        int numero = 1;
        int contador;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber a tabuada");
        contador = sc.nextInt();

        while(numero <= 10){
            System.out.println(numero + "X" + numero + "=" + (numero * contador));

            numero++;
        }
    }
}
