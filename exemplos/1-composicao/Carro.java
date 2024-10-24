
public class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public void ligar() {
        this.motor.ligar();
    }
}
