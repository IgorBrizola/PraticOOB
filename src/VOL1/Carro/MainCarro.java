package VOL1.Carro;

public class MainCarro {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        meuCarro.modelo = "BMW X6";
        meuCarro.cor = "Branca";
        meuCarro.anoDeLancamento = 2018;

        meuCarro.exibeFichaTecnica();


    }
}
