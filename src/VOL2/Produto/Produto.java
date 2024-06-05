package VOL2.Produto;

public class Produto {

    private String nome;
    private double preco;

    public void exibeFichaTecnica() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço do Produto: $" + preco);
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;

        System.out.println("Preço com desconto aplicado: $" + preco);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
