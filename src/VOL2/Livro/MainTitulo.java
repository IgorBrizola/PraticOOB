package VOL2.Livro;

public class MainTitulo {
    public static void main(String[] args) {
        Livro meuLivro = new Livro();

        meuLivro.setTitulo("Codificador Limpo");
        meuLivro.setAutor("Pedro");

        meuLivro.exibeAutor();
    }
}
