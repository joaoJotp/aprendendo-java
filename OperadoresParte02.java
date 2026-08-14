package flamingo.aprendendo.basico;

public class OperadoresParte02 {
    public static void main(String[] args){
        /*
        * < menor que
        * > maior que
        * <= menor ou igual
        * >= maior ou igual
        * == igual a
        * != diferente de
        * */

        byte idadePai = 42;
        byte idadeMae = 32;
        byte idadeIrmao = 35;
        System.out.println(idadePai < idadeMae);
        System.out.println(idadePai > idadeMae);
        System.out.println(idadePai <= idadeIrmao);
        System.out.println(idadePai >= idadeIrmao);
        System.out.println(idadePai == idadeIrmao);
        System.out.println(idadePai != idadeIrmao);

    }
}
