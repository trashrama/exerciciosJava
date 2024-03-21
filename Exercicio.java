import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio {
    public static void main(String[] args) {
        Set<Integer> alunosA = new HashSet<>();
        Set<Integer> alunosB = new HashSet<>();
        Set<Integer> alunosC = new HashSet<>();
        Set<Integer> alunosAlex = new HashSet<>();

        Scanner in = new Scanner(System.in);

        int id;



        System.out.println("Digite os números de alunos {a} (0 finaliza): ");
        do {
            id = in.nextInt();
            if (id != 0)
                alunosA.add(id);
        }while(id != 0);

        System.out.println("Digite o número de alunos {b} (0 finaliza): ");
        do {
            id = in.nextInt();
            if (id != 0)
                alunosB.add(id);
        }while(id != 0);

        System.out.println("Digite o número de alunos {c} (0 finaliza): ");
        do {
            id = in.nextInt();
            if (id != 0)
                alunosC.add(id);
        }while(id != 0);

        alunosB.addAll(alunosC);
        alunosA.addAll(alunosB);
        alunosAlex.addAll(alunosA);
        alunosAlex.forEach((n)-> System.out.printf("ID: %d\n", n));

        System.out.println(alunosAlex.size());







    }
}
