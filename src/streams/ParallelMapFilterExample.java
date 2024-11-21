package streams;

import java.util.Map;
import java.util.stream.Collectors;

public class ParallelMapFilterExample {

    public static void main(String[] args) {

        // Filtrar y recolectar en paralelo
        // Filtrar un mapa basado en una condición y recolectar los resultados en paralelo.
        Map<Integer, String> map = Map.of(
                1, "Uno",
                2, "Dos",
                3, "Tres",
                4, "Cuatro"
        );

        Map<Integer, String> filteredMap = map.entrySet().parallelStream()
                .filter(entry -> entry.getKey() % 2 == 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredMap); // Output: {2=Dos, 4=Cuatro}
    }
}
