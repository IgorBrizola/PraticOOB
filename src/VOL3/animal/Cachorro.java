package VOL3.animal;

public class Cachorro extends Animal{


    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public void abanarRabo(){
        System.out.println(getNome() + " está abanando o rabo");
    }
}
