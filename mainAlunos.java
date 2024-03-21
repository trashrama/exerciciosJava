import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mainAlunos {

    public static void main(String[] args) {
       // Aluno a1 = new Aluno("Jozer", 2);
       // Aluno a2 = new Aluno("Jozer", 2);

        //System.out.println(a1.compareTo(a2));
        ArrayList<Aluno> lista = new ArrayList<Aluno>();
//

        //lista.add(a1);
        //lista.add(a2);

        String a1 = new String("Lai");
        String a2 = new String("Lai");

        System.out.println(a1 == a2);

        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode() + " " + a2.hashCode());


    }

}
