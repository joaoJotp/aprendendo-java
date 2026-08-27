package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalEleitores , votosBrancos, votosNulos, votosValidos;
        double percentualBrancos, percentualNulos, percentualValidos;

        System.out.println("Digite o total eleitores:");
        totalEleitores = sc.nextInt();

        System.out.println("Digite o total de votos Brancos:");
        votosBrancos = sc.nextInt();

        System.out.println("Digite o total de votos nulos");
        votosNulos = sc.nextInt();

        System.out.println("Digite o total de votos Validos");
        votosValidos = sc.nextInt();

        percentualBrancos = (votosBrancos * 100) / totalEleitores;
        percentualNulos = (votosNulos * 100) / totalEleitores;
        percentualValidos = (votosValidos * 100) / totalEleitores;

        System.out.printf("""
    ============= TOTAL DE &f VOTOS =============
    | Votos Branco = %f%%                        |
    | Votos Nulos = %f%%                         |
    | Votos Validos = %f%%                       |
    """ , totalEleitores,percentualBrancos,percentualNulos,percentualValidos);
    }
}
