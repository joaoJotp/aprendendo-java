package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.basico.estruturaswitch.repeticao;

public class Exercicio04 {
    static void main(String[] args) {
        int soma = 0;

        for (int numero = 1; numero <= 100; numero++){
            soma += numero;
            System.out.println("A soma de 1 a 100 é  +" + soma);
        }
    }
}
