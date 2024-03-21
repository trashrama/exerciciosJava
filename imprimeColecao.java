import java.util.ArrayList;

// Generics <T>: Um recurso que pode criar variáveis com vários tipos.

public class imprimeColecao <T>{


    ArrayList<T> lista = new ArrayList<T>();
    public void addValor(T valor){
        lista.add(valor);
    }

    public T primeiro(){
        return lista.getFirst();
    }

    public void imprimir(){
        lista.forEach((num) -> System.out.printf("%s\n", num));
    }
}
