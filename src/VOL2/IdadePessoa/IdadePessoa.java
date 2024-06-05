package VOL2.IdadePessoa;

public class IdadePessoa {

    private String nome;
    private int idade;

    public void verificarIdade(){
        if (idade >= 18){
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }
    }

    public void exibePessoa(){
        System.out.println("Nome Da Pessoa: " + nome);
        System.out.println("Idade Da Pessoa: " + idade);
        verificarIdade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
