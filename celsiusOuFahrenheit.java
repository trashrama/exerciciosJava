import java.util.Scanner;
public class celsiusOuFahrenheit {
    public static void main(String[] args) {
        conversao();
    }


    public static float celsiusToFahrenheit(float c){
        return (9*c/5) + 32;
    }

    public static float fahrenheitToCelsius(float f){
        return 5*(f-32)/9;
    }
    public static void conversao(){
        Scanner in = new Scanner(System.in);

        int opc;
        float c, f;

        do {
            System.out.println("===== MENU =====");
            System.out.println("[1] - Celsius para Fahrenheit");
            System.out.println("[2] - Fahrenheit para Celsius");
            System.out.println("[3] - Sair do Programa");

            opc = in.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Digite o valor em Celsius: ");
                    c = in.nextFloat();
                    System.out.printf("%.2fF é %.2fº\n", c, celsiusToFahrenheit(c));

                    break;
                case 2:
                    System.out.println("Digite o valor em Fahrenheit: ");
                    f = in.nextFloat();
                    System.out.printf("%.2fF é %.2fº\n", f, fahrenheitToCelsius(f));
                    break;
                case 3:
                    System.out.println("Adeus!!");
                    break;
            }

        } while(opc != 3);

    }
}
