package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.basico.estruturaswitch.exerciciosArray;

import java.util.Scanner;

public class Ex001 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String [] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite o nome do aluno: ");

            nomes[i] = sc.nextLine();
        }

        for (String name : nomes){
            System.out.println(name);
        }

        sc.close();

        }
    }
