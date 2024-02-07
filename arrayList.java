// Aula de ArrayList
// Mesma função de um vetor, mas ele é alocado dinamicamente.
// Ele não possui um tipo determinado, então o primeiro elemento pdoe se rum tipo diferente
// do segundo elemento.

// Vetor = Homogêneo
// ArrayList == Heterogeneo

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args){
        ArrayList lista = new ArrayList();


        // adicionar elementos (add)
        lista.add(10);
        lista.add(500.00f);
        lista.add("Santiago");


        // exibir (get)
        System.out.println(lista.get(0));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // remover

        lista.remove(2);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // forçar o tipo
        ArrayList<String> novaLista = new ArrayList();

    }

    // Array faz parte de uma estrutura maior de Collections. Que é o conjunto de estruturas de dados em Java.
}
