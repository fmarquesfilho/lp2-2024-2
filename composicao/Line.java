
public class Line {
    private Point inicio;
    private Point fim;

    public Line(Point inicio, Point fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public String toString() {
        String s = "Eu sou uma linha composta pelos seguintes pontos; " + "\n";
        s += this.inicio.toString() + "\n";
        s += this.fim.toString() + "\n";
        return s;
    }
}
