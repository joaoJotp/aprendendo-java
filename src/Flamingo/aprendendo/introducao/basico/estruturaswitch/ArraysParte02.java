package flamingo.aprendendo.basico.exercicios.estrutuascondicionais.src.Flamingo.aprendendo.introducao.basico.estruturaswitch;

public class ArraysParte02 {
    static void main(String[] args) {
        int i = 0;
        String [] nomes = new String[4];

        nomes [0] = "Goku";
        nomes [1] = "Luffy";
        nomes [2] = "Naruto";
        nomes [3] = "Ichigo";

        while (i < nomes.length){
            System.out.println(nomes[i]);
            i++;
        }
        nomes = new String[5];
        nomes[4] = "Zoro";
        System.out.println(nomes[4]);
    }
}
