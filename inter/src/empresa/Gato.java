package empresa;

public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miauu!!!");
    }

    @Override
    public void dormir() {
        System.out.println("zzz");
    }
}
