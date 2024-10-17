
public class TesteLinha {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(3.0, 4.0);

        Line linha = new Line(p1, p2);
        System.out.println(linha.toString());
    }
}
