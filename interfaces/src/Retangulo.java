public class Retangulo implements FormaGeometrica{

    private float base, altura;

    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    public float area(){
        return base*altura;
    }
}
