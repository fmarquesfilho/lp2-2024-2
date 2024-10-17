
public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        String s = "Ponto x: " + this.x + "\nPonto y: " + this.y + "\n";
        return s;
    }
}
