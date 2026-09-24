package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.intermediario.teste;

import flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.intermediario.dominio.Estudante;

import java.util.Scanner;

public class EstutanteTest01 {
    static void main(String[] args) {
        Estudante estudante = new Estudante ();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do estudante: ");
        String nome = sc.nextLine();
        estudante.nome = nome;

        System.out.println("Digite a idade do estudante");
        int idade = Integer.parseInt(sc.nextLine());
        estudante.idade = idade;

        System.out.println("Digite o rg do estudante");
        String rg = sc.nextLine();
        estudante.rg = rg;

        System.out.println("Digite o tel do estudante");
        String tel = sc.nextLine();
        estudante.tel = tel;

        System.out.println("Digite o curso do estudante");
        String curso = sc.nextLine();
        estudante.curso = curso;



        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.rg);
        System.out.println(estudante.tel);
        System.out.println(estudante.curso);
    }
}
