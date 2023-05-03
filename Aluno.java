public class Aluno extends Pessoa {
    private String semeste;
    private String curso;

    public void setSemeste(String semeste) {
        this.semeste = semeste;
    }

    public String getSemeste() {
        return semeste;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public Aluno(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        setSemestre(semestre);
        setCurso(curso);
    }

    public Aluno() {

    }
}
