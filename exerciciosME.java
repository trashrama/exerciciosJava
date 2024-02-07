import java.util.Scanner;
import java.util.Locale;

public class exerciciosME {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        int a = 4, b = 6;
        System.out.printf("entre %d e %d, o maior eh %d\n\n", a, b, maior(a,b));

        System.out.printf("O delta deu %.2f", delta());


    }

    public static int maior(int a, int b){
        if (a>b){
            return a;
        }else if(b>a){
            return b;
        }else{
            return a; // pra dizer que sao iguais
        }
    }

    public static float delta(){
        Scanner in = new Scanner(System.in);
        float a, b, c, delta;

        System.out.print("Digite o valor de A, B, C: ");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();

        delta = (float) (Math.pow(b, 2) - 4*a*c);
        return delta;
    }

}
