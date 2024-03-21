import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        //Set<String> listaStrings = new HashSet<String>();
        Set<String> listaStrings = new LinkedHashSet<>();
        Set<String> novaListaStrings = new LinkedHashSet<>();


        listaStrings.add("Branco");
        listaStrings.add("Verde");
        listaStrings.add("Azul");

        novaListaStrings.add("Vermelho");
        novaListaStrings.add("Amarelo");
        novaListaStrings.add("Azul");

        //listaStrings.removeIf(x-> x.startsWith("A"));
        //System.out.println(listaStrings.contains("Azul"));

        listaStrings.removeAll(novaListaStrings);
        listaStrings.forEach((cor)-> System.out.println(cor));

    }
}
