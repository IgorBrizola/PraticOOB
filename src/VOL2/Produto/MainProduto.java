package VOL2.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();


        meuProduto.setNome("Camisa da SUF GANG");
        meuProduto.setPreco(189.90);


        meuProduto.exibeFichaTecnica();

        meuProduto.aplicarDesconto(5);

    }
}
