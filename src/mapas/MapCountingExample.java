package mapas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapCountingExample {

    public static void main(String[] args) {

        //  Contar elementos por categoría en un mapa
        // Usar Collectors.groupingBy con counting.
        List<String> names = List.of("Ana", "Juan", "Pedro", "Ana", "Pedro");

        Map<String, Long> countByName = names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        System.out.println(countByName); // Output: {Ana=2, Juan=1, Pedro=2}
    }
}
