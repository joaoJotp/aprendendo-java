package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.estrutuascondicionais.estrutuascondicionais;

import java.util.Scanner;

public class EstruturasCondicionaisParte04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String resultado;
        System.out.println("Digite um dia na semana de 1 a 7");
        byte diaSemana = sc.nextByte();
        switch (diaSemana){
            case 1 :
                resultado = "Domingo" ;
                break;
            case 2 :
                resultado = "Segunda-feira";
                break;
            case 3 :
                resultado = "Terça-feira";
                break;
            case 4 :
                resultado = "Quarta-feira";
                break;
            case 5 :
                resultado = "Quinta-feira";
                break;
            case 6 :
                resultado = "Sexta-feira";
                break;
            case 7 :
                resultado = "Sabado";
                break;
            default:
                resultado = "Dia invalido";
                break;

        }
        System.out.println(resultado);
        sc.close();
    }
}
