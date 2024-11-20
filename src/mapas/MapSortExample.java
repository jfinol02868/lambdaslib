package mapas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortExample {

    public static void main(String[] args) {

        //Usar sorted para ordenar las entradas.
        Map<Integer, String> map = Map.of(3, "Tres", 1, "Uno", 2, "Dos");

        // Ordenar por clave
        Map<Integer, String> sortedByKey = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println(sortedByKey); // Output: {1=Uno, 2=Dos, 3=Tres}
    }
}
