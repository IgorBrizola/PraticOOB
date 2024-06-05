package VOL1.Aluno;

import java.time.LocalDate;

public class Aluno {
    String nome;
    String turma;
    int dataNascimento;
    LocalDate hoje = LocalDate.now();

    void exibeFichaTecnica(){
        System.out.println("Nome Do MD1.Aluno: " + nome);
        System.out.println("Idade Do MD1.Aluno: " + pegaIdade());
        System.out.println("Turma Do MD1.Aluno: " + turma);
    }

    int pegaIdade(){
       return hoje.getYear() - dataNascimento;
    }
}
