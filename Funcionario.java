public class Funcionario {

    String nome;
    float salario;
    int id;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", id=" + id +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId(){ return id; }

    public Funcionario(int id, String nome, float salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(float porc){
        salario *= 1 + porc;
    }


}
