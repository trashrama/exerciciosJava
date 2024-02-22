public abstract class Eletrodomestico {

    String modelo;

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public abstract void liga();
}
