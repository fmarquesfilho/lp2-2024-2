import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaDeAlunos = new ArrayList<String>();
        listaDeAlunos.add("fulano");
        listaDeAlunos.add("fulano");
        listaDeAlunos.add("ciclano");
        listaDeAlunos.add("beltrano");
        System.out.println(listaDeAlunos);
        listaDeAlunos.remove("fulano");
        listaDeAlunos.remove("fulano");
        System.out.println(listaDeAlunos);
    }
}
