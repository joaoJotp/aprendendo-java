package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.intermediario.teste;

import flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.intermediario.dominio.Curso;

import java.util.Scanner;

public class CursoTeste01 {
    static void main() {
        Curso curso = new Curso();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do curso");
        String nome = sc.nextLine();
        curso.nome = nome;

        System.out.println("Digite a duração do curso");
        byte duracaoAnos = sc.nextByte();
        curso.duracaoAnos = duracaoAnos;

        System.out.println("Digite o valor da mensalidade");
        int mensalidade = sc.nextInt();
        curso.mensalidade = mensalidade;

        System.out.println("Digite o modelo do curso");
        String modelo = sc.nextLine();
        curso.modelo = modelo;

        System.out.println("Digite o turno do seu curso");
        String turno = sc.nextLine();
        curso.turno = turno;
    }
}
