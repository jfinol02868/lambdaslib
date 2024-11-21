package streams;

import java.util.List;

public class ParallelFindAnyExample {

    public static void main(String[] args) {

        // Encuentra un elemento en Streams paralelos.
        final String NOTHING = "Ninguno";

        List<String> names = List.of("Ana", "Juan", "Pedro");

        String result = names.parallelStream().findAny().orElse(NOTHING);
        System.out.println(result); // Output: Puede ser cualquier elemento
    }
}
