package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.intermediario.teste;

import flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.intermediario.dominio.Professor;

import java.util.Scanner;

public class ProfessorTeste01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Professor");
        String nome = sc.nextLine();
        professor.nome = nome;

        System.out.println("Digite a idade");
        int idade = Integer.parseInt(sc.nextLine());
        professor.idade = idade;

        System.out.println("Digite a disciplina");
        String disciplina = sc.nextLine();
        professor.disciplina = disciplina;

        System.out.println("Digite o salario");
        int salario = sc.nextInt();
        professor.salario = salario;
    }
}
