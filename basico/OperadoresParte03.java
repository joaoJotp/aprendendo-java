package flamingo.aprendendo.basico;

public class OperadoresParte03 {
    public static void main(String[] args){

        /*
        * && AND -> E
        * || OR -> OU
        * ! NOT -> NÂO
        * */

        byte idade = 20 ;
        boolean isCNH = true;
        boolean isEstaNaLeiparaDirigir = idade >= 18 && isCNH ;

        System.out.println(isEstaNaLeiparaDirigir);
    }
}
