package VOL4.calculavel;

import java.util.Scanner;

public class ProdutoFisico implements Calculavel{

    Scanner leitura = new Scanner(System.in);

    private String nome;
    private double preco;

    public void precoFinal(){
        System.out.println("Você adicionou ao carrinho: " + getNome());
        System.out.println("Preço das suas compras com um desconto de 5% ficou por: R$ " + calcularPrecoFinal());
    }

    @Override
    public double calcularPrecoFinal() {
       double valor = preco * 0.05;
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
