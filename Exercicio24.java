package flamingo.aprendendo.basico.exercicios.estrutuascondicionais;

public class Exercicio24 {
    static void main(String[] args) {
        int temperatura = 26;
        String res;

        if (temperatura < 15){
            res = "Frio";
        } else if (temperatura < 26) {
            res = "Agradavel";
        }else if (temperatura < 35){
            res = "Quente";
        }else {
            res = "Muito quente";
        }
        System.out.println(res);
    }
}
