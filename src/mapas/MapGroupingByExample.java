package mapas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapGroupingByExample {

    public static void main(String[] args) {

        // Crear un mapa agrupado por un criterio
        // Usar Streams para agrupar datos y construir un mapa.
        List<String> names = List.of("Ana", "Juan", "Pedro", "Lucía");

        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength); // Output: {3=[Ana], 4=[Juan], 5=[Pedro, Lucía]}
    }
}
