public class Teste {
    public static void main(String[] args) {
        Generico teste = new Generico();
        Double arrayD[] = {1.2, 4.2,.5, 6.4};
        System.out.println("Maior elemento: " + teste.maior(arrayD));
        String arrayS[] = {"A", "B", "Z"};
        System.out.println("Maior elemento: " + teste.maior(arrayS));
    }
}
