import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Excecoes {
    public static void main(String[] args) {

        metodo1();
        System.out.println("Finalizou!!!");

    }

    public static void metodo1(){
        System.out.println("---- Método 1 ----");
        Scanner in = new Scanner(System.in);

        try {
            String[] vet = in.nextLine().split(" ");
            System.out.println("Indice: ");
            int i = in.nextInt();
            System.out.println(vet[i]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Você é jumento.");
            System.out.println("Na próxima, digite um índice válido.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("Você é idiota?");
            System.out.println("Digite um valor inteiro.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("---- Encerrando o Método 1 ----");


    }
}
