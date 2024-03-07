
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Scanner st = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios;
        funcionarios = lerFuncionarios();
        aumento(funcionarios);
    }

    public static ArrayList<Funcionario> lerFuncionarios(){
        int num, id;
        String nome;
        float salario;
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();


        System.out.printf("Digite o número de funcionários: ");
        num = in.nextInt();

        if (num > 0){
            for (int i = 0; i < num; i++) {
                System.out.printf("Digite o ID do Funcionário %d: ", i+1);
                id = in.nextInt();
                System.out.printf("Digite o nome do Funcionário %d: ", i+1);
                nome = st.next();
                System.out.printf("Digite o salario do Funcionário %d: ", i+1);
                salario = in.nextFloat();
                funcionarios.add(new Funcionario(id, nome, salario));


            }
        }
        return funcionarios;

    }
    public static void aumento(ArrayList<Funcionario> func){
        int id;
        float porc;
        boolean encontrou = false;

        System.out.printf("Digite o ID do funcionário a ter o salário aumentado: ");
        id = in.nextInt();

        for (Funcionario f: func){
            if (f.getId() == id) {
                System.out.printf("Digite a porcentagem do aumento:");
                porc = in.nextFloat();
                f.aumentarSalario(porc);
                System.out.printf("O aumento para %s foi realizado com sucesso!\n", f.getNome());
                encontrou = !encontrou;
            }
        }

        if (encontrou)
            lista(func);
        else
            System.out.println("O ID não foi encontrado. Finalizando o programa..");
        

    }
    public static void lista(ArrayList<Funcionario> func){
        for(Funcionario f: func){
            System.out.println(f.toString());
        }
    }
}