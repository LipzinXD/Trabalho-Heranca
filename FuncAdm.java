public class FuncAdm extends Funcionario {
    private String setor;
    private String cargo;

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public FuncAdm(String nome, int idade, String endereco, double salario, String setor, String cargo){
        super(nome, idade, endereco, salario);
        this.setor = setor;
        this.cargo = cargo;
    }
    public FuncAdm(){
        
    }
}
