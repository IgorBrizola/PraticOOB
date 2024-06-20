package VOL3.animal;

public class MainAnimal {
    public static void main(String[] args) {


        Cachorro antonio = new Cachorro();

        antonio.setNome("Antonio");

        System.out.println(antonio.getNome() + " Está fazendo som de ");
        antonio.emitirSom();
        antonio.abanarRabo();

        Gato juquinha = new Gato();
        juquinha.setNome("Juquinha");
        System.out.println(juquinha.getNome() + " Está fazendo som de ");
        juquinha.emitirSom();
        juquinha.arranharMoveis();


    }
}
