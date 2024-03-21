import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Loja {

    static Map<String, Produto> estoque = new HashMap<>();
    static Scanner in = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void addProduto(String nomeProduto, int qtd) {


        if (estoque.containsKey(nomeProduto)) {
            System.out.println("Já existe, substituindo...");
            System.out.println(estoque.get(nomeProduto) + qtd);
            estoque.replace(nomeProduto, estoque.get(nomeProduto) + qtd);
            return;
        }
        estoque.put(nomeProduto, new Produto(nomeProduto, qtd));
    }

    public static void removerProduto(String nomeProduto, int qtd) {
        if (estoque.containsKey(nomeProduto)) {
            if (estoque.get(nomeProduto) - qtd > 0) {
                estoque.replace(nomeProduto, estoque.get(nomeProduto) - qtd);
                System.out.println("Removido com sucesso!");
                return;
            }

            System.out.println("Não é possível zerar o estoque.");
            return;
        }

        System.out.println("Não está contido na lista.");

    }


    public static void verificaEstoque(String nomeProduto) {
        System.out.printf("Estoque de %s: %d\n", nomeProduto, estoque.get(nomeProduto));
    }

    public static void listarProdutos() {
        estoque.forEach((key, value) -> System.out.println("PRODUTO: " + key + " - " + value + " unid."));
    }

    public static void menu() {
        int opc, bufInt;
        String bufChar;

        do {
            System.out.println("---- MENU ----");
            System.out.println("[1] - Adicionar Produto");
            System.out.println("[2] - Remover Produto");
            System.out.println("[3] - Consulta por estoque");
            System.out.println("[4] - Listar Produtos");
            System.out.println("[0] - Sair");
            System.out.printf("Digite a sua opção: ");
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite o nome do produto a ser adicionado: ");
                    bufChar = sc.next();
                    System.out.println("Digite a quantidade do produto a ser adicionado");
                    bufInt = in.nextInt();
                    addProduto(bufChar, bufInt);
                    break;
                case 2:
                    System.out.println("Digite o nome do produto a remover quantidade");
                    bufChar = sc.next();
                    System.out.println("Digite a quantidade do produto a ser removida");
                    bufInt = in.nextInt();
                    removerProduto(bufChar, bufInt);
                    break;
                case 3:
                    System.out.println("Digite o nome do produto a verificar no estoque: ");
                    bufChar = sc.next();
                    verificaEstoque(bufChar);
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        } while (opc != 0);
    }
}
