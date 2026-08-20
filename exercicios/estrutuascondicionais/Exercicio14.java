package src.Flamingo.aprendendo.introducao.basico.exercicios.estrutuascondicionais;

public class Exercicio14 {
    static void main(String[] args) {
        boolean emailCorreto = true;
        boolean senhaCorreta = true;

        if (senhaCorreta && emailCorreto){
            System.out.println("login realizado");
        }else {
            System.out.println("Email ou senha invalidos");
        }
    }
}
