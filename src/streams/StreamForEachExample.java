package streams;

import java.util.List;

public class StreamForEachExample {
    public static void main(String[] args) {

        // Ejecuta una acción para cada elemento.
        List<String> names = List.of("Ana", "Juan", "Pedro");
        names.forEach(name -> System.out.println("Hola, " + name));
    }
}
