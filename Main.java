import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        imprimeColecao i = new imprimeColecao();

        System.out.println("Digite a quantidade de números: ");
        int qtd_num = in.nextInt();

        in.nextLine();
        for (int j = 0; j < qtd_num; j++) {
            i.addValor(in.nextLine());
        }

        System.out.println(i.primeiro());
        i.imprimir();



    }
}