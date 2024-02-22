public abstract class ContaAbstrata {
    private float saldo;

    abstract public void depositar(float valor);
    abstract public void sacar(float valor);

    public void setSaldo(float valor){
        saldo = valor;
    }
    public float getSaldo(){
        return saldo;
    }
}
