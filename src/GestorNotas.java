import java.util.ArrayList;
import java.util.List;

public class GestorNotas {
    private static int contadorId = 1;
    private List<Nota> notas;

    public GestorNotas() {
        this.notas = new ArrayList<>();
    }

    public void crearNota(String titulo, String contenido, boolean importante) {
        int id = contadorId++;
        notas.add(new Nota(id, titulo, contenido, importante));
    }

    public void listarNotas() {
        notas.stream().forEach(System.out::println);
    }


}
