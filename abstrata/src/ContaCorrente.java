public class ContaCorrente extends ContaAbstrata {


    public ContaCorrente(float saldoInicial){
        super.setSaldo(saldoInicial);
    }

    public ContaCorrente(){
        super.setSaldo(0f);
    }


    public void depositar(float valor){
        super.setSaldo(super.getSaldo()+valor);
    }

    public void sacar(float valor){
        super.setSaldo(super.getSaldo()-valor);
    }


}
