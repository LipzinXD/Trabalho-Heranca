public class Professor extends Funcionario  {
    private String disiplina;

    public void setDisiplina(String disiplina) {
        this.disiplina = disiplina;
    }

    public String getDisiplina() {
        return disiplina;
    }

    public Professor(String nome, int idade, String endereco, double salario, String disiplina){
super(nome, idade, endereco, salario);

    }
}
