package VOL2.Aluno;

public class Aluno {

    private String nome;
    private double somaDasNotas;
    private int totalDasNotas;

    public void exibeFichaTecnica() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Media do aluno: " + pegaMedia());
    }

    public void avalia(double nota) {
    somaDasNotas += nota;
    totalDasNotas++;
    }

    public double pegaMedia(){
    return somaDasNotas / totalDasNotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
