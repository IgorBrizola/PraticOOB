package VOL4.calculavel;

public class Livro implements Calculavel{

    private String nome;
    private double preco;

    public void precoFinal(){
        System.out.println("Você adicionou ao carrinho: " + getNome());
        System.out.println("Preço das suas compras com um desconto de 15% ficou por: R$ " + calcularPrecoFinal());
    }

    @Override
    public double calcularPrecoFinal() {
        double valor = preco * 0.15;
        return preco - valor;
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
