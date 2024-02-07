import java.util.Scanner;
import java.util.ArrayList;

public class exercicioArrayList {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList();
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Vermelho");

        for (int i = 0; i < cores.size(); i++) {
            System.out.println(cores.get(i));
        }
        System.out.println("----");
        System.out.printf("O seu arraylist é de tamanho %d.\n", cores.size());

        cores.add(0, "Turquesa");
        cores.remove(2);

        for (int i = 0; i < cores.size(); i++) {
            System.out.println(cores.get(i));
        }


    }
}
