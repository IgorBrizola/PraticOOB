package VOL1.Musica;

public class Musica {
     String artista;
     String titulo;
     int anoDeLancamento;
     double avaliacao;
     int numeroAvaliacoes;


    void exibeFichaTecnica(){
        System.out.println("Titulo Da MD1.Musica: " + titulo);
        System.out.println("Artista Da MD1.Musica: " + artista);
        System.out.println("Ano De Lançamento Da MD1.Musica: " + anoDeLancamento);
        System.out.println("Nota De Avaliação: " + pegaMedia());
        System.out.println("Total De Avaliações: " + numeroAvaliacoes);
    }

    void avalia(int nota){
        avaliacao += nota;
        numeroAvaliacoes++;
    }

    double pegaMedia(){
      return  avaliacao / numeroAvaliacoes;
    }
}
