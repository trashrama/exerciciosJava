import java.util.*;
public class Maps {
    // É um dicionário igual o Python.
    // HashMap: sem ordem
    // TreeMap: Ordenado
    // LinkedHashMap: Ordem inserida!


    public static void main(String[] args) {
        Map<String, Integer> dicionario = new HashMap<>();
        dicionario.put("Oii", 0);
        dicionario.put("ola", 1);
        dicionario.put("hi", 2);
        dicionario.put("hello", 3);
        //dicionario.clear();
        //remove(key)
        //containsKey(key)
        //get(Key)
        //keySet()
        //values()
        //size()


        System.out.println(dicionario);
    }
}
