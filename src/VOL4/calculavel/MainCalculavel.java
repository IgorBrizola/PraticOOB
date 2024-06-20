package VOL4.calculavel;

public class MainCalculavel {
    public static void main(String[] args) {

    ProdutoFisico produto = new ProdutoFisico();
        System.out.println("Produtos Fisicos: \n");
    produto.setNome("Barbie");
    produto.setPreco(199.99);
    produto.precoFinal();
        System.out.println("\n");

        produto.setNome("Carrinho");
    produto.setPreco(100.00);
    produto.precoFinal();
        System.out.println("\n");
        Livro livro = new Livro();
        System.out.println("Meus livros: \n");
        livro.setNome("GOT");
        livro.setPreco(99.99);
        livro.precoFinal();
        System.out.println("\n");

        livro.setNome("Diario de um banana");
        livro.setPreco(120.60);
        livro.precoFinal();

    }
}
