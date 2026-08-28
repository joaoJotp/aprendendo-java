package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.estrutuascondicionais.estrutuascondicionais;

public class Exercicio21 {
    static void main(String[] args) {
        int idade = 60;
        String res;

        if (idade < 12){
            res = "Criança";
        } else if (idade >= 12 && idade <= 17) {
            res = "Adolecente";
        }  else if (idade >= 18 && idade <= 59){
            res = "Adulto";
        }else {
            res = "Idoso";
        }
        System.out.println(res);
    }
}
