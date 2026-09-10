package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.estrutuascondicionais.estrutuascondicionais;

public class OperadoresParte05 {
    public static void main(String [] args){
        // Operadores de atribuição
        /*
        * = atribuição
        * += soma e atribuir
        * -= subtração e atribuição
        * *= multiplicação e atribuição
        * /= divisao e atribuição
        * %= resto da divisao e atribuição
        * */

        double totalCompra = 0;

        totalCompra += 50;
        totalCompra += 100;
        totalCompra += 50 ;

        totalCompra /= 2;

        System.out.printf("Total da compra = %.2f",totalCompra);
    }
}
