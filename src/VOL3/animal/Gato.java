package VOL3.animal;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis(){
        System.out.println(getNome() + " Arranhou o movel da sala");
    }
}
