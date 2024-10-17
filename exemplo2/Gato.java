package exemplo2;

public class Gato extends Animal {

    public void nascer() {
        super.nascer();
        System.out.println("E é um gatinho.");
    }

    public void emitirSom() {
        System.out.println("Miau");
    }
}
