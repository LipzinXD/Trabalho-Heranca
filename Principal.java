public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Felipe", 17, "Teriano dos santos 237", "5° Semestre", "Info");
        Professor professor = new Professor("Garbriella", 16, "Rafael Bergonço 294", 10000, "Portuês");
        FuncAdm funcAdm = new FuncAdm("Silvana", 50, "Rafael Bergonço 294", 3800, "RH", "RH");

        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.println("Idade do aluno: " + aluno1.getIdade());
        System.out.println("Endereço do aluno: " + aluno1.getEndereço());
        System.out.println("Semestre do aluno: " + aluno1.getSemestre());
        System.out.println("Curso do aluno: " + aluno1.getCurso() + "\n");
        
        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Idade do professor: " + professor.getIdade());
        System.out.println("Endereço do professor: " + professor.getEndereço());
        System.out.println("Salario do professor: " + professor.getSalario());
        System.out.println("Disciplina do professor: " + professor.getDisciplina() + "\n");

        System.out.println("Nome do funcionario: " + funcAdm.getNome());
        System.out.println("Idade do funcionario: " + funcAdm.getIdade());
        System.out.println("Endereço do funcionario: " + funcAdm.getEndereço());
        System.out.println("Salario do funcionario: " + funcAdm.getSalario());
        System.out.println("Setor do funcionario: " + funcAdm.getSetor());
        System.out.println("Cargo do funcionario: " + funcAdm.getCargo());

    }
}
