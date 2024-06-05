package VOL2.Aluno;

public class MainAluno {
    public static void main(String[] args) {

        Aluno meuALuno = new Aluno();

        meuALuno.setNome("Joãozinho");

        meuALuno.avalia(10);
        meuALuno.avalia(8.5);
        meuALuno.avalia(9);
        meuALuno.avalia(7.5);

        meuALuno.exibeFichaTecnica();

    }
}
