package VOL2.Livro;

public class Livro {

    private String autor;
    private String titulo;

    public void exibeAutor(){
        System.out.println("Nome do autor: " + autor);
        System.out.println("Titulo do autor: " + titulo);
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
