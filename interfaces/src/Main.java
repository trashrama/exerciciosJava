public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FormaGeometrica q = new Quadrado(10);
        FormaGeometrica t = new Retangulo(2,3);
        System.out.println(q.area());

        OperacaoMatematica minhaSoma = new Soma();
        OperacaoMatematica minhaMultiplicacao = new Multiplicacao();
        OperacaoMatematica minhaDivisao = new Divisao();
        OperacaoMatematica minhaSubtracao = new Subtracao();


        System.out.println(        minhaSoma.calcula(1,3));
        System.out.println(        minhaMultiplicacao.calcula(1,3));
        System.out.println(                minhaDivisao.calcula(1,3));
        System.out.println(                        minhaSubtracao.calcula(1,3));



    }
}