package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio44 {
    static void main() {

        String emailCorreto = "gabriel18ll@gmail.com";
        String senhaCorreta = "12345";
        Boolean contaAtiva = true;


        if (emailCorreto == "gabriel18ll@gmail.com" && senhaCorreta == "12345"){
            System.out.println("Login realizado");
        } else if (emailCorreto != "gabriel18ll@gmail.com" || senhaCorreta != "12345")  {
            System.out.println("Dados invalidos");
        } else if (contaAtiva == false){
            System.out.println("Conta bloqueada");
        } else{
            System.out.println(" ");
        }

    }
}
