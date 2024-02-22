public class Quadrado implements FormaGeometrica {


    private float lado;

    public Quadrado(float lado){
        this.lado = lado;
    }
    public float area(){
        return lado*lado;
    }

}
