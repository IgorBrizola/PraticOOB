package VOL1.Musica;

public class MainMusica {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "SUV";
        minhaMusica.artista = "Ryu The Runner";
        minhaMusica.anoDeLancamento = 2024;

        minhaMusica.avalia(10);
        minhaMusica.avalia(10);
        minhaMusica.avalia(4);

        minhaMusica.exibeFichaTecnica();


    }
}
