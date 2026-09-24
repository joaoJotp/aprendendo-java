package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.intermediario.teste;

import flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.intermediario.dominio.Disciplina;

import java.util.Scanner;

public class DisciplinaTeste01 {
    static void main(String[] args) {
        Disciplina disciplina = new Disciplina();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina");
        String nome = sc.nextLine();
        disciplina.nome = nome;

        System.out.println("Digite a carga horaria da disciplina");
        int cargaHoraria = sc.nextInt();
        disciplina.cargaHoraria = cargaHoraria;

        System.out.println("Digite o nome do professor");
        String nomeProfessor = sc.nextLine();
        disciplina.nomeProfessor = nomeProfessor;

        System.out.println("Digite os semestres da disciplina");
        byte semestre = sc.nextByte();
        disciplina.semestre = semestre;
    }
}
