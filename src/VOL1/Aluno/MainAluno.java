package VOL1.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno meuAluno = new Aluno();

        meuAluno.nome = "João Silva";
        meuAluno.dataNascimento = 2005;
        meuAluno.turma = "3°DS";

        meuAluno.exibeFichaTecnica();


    }
}
