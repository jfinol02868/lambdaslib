package streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ParallelMapSortExample {

    public static void main(String[] args) {

        // Ordenar claves o valores en paralelo
        // Ordenar los valores de un mapa en paralelo.
        Map<Integer, String> map = Map.of(
                3, "Tres",
                1, "Uno",
                4, "Cuatro",
                2, "Dos"
        );

        Map<Integer, String> sortedMap = map.entrySet().parallelStream()
                .sorted(Map.Entry.comparingByValue()) // Ordenar por valor
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println(sortedMap); // Output: {4=Cuatro, 2=Dos, 3=Tres, 1=Uno}
    }
}
