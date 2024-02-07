public class metodosEstaticos {

    public static void main(String[] args) {
        // Métodos podem ser públicos ou estáticos.
        // Estáticos: pertencem a classe, e não ao objeto.
        // Públicos: são vistos por todos, inclusive fora da classe.

        int a = 10, b = 3, c = soma(a,b);
        System.out.printf("%d + %d = %d\n", a, b, c);

        hello();
    }

    public static void hello(){
        System.out.println("Hello, world!");
    }

    // funções ou procedimento: procedimento nao tem retorno e funcao tem
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    // assinatura de um método nao é o nome, mas sim o retorno + os parametros que ele guarda.

    // sobrecarga de metodo: um metodo com mesmo nome

}
