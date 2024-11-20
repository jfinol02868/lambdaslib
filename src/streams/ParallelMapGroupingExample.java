package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParallelMapGroupingExample {

    public static void main(String[] args) {

        // Agrupar valores en paralelo
        // Usar groupingBy para agrupar valores basados en alguna propiedad en paralelo.
        Map<Integer, String> map = Map.of(
                1, "Uno",
                2, "Dos",
                3, "Tres",
                4, "Cuatro"
        );

        Map<Integer, List<String>> groupedByLength = map.values().parallelStream()
                .collect(Collectors.groupingBy(String::length)); // Agrupar por longitud de valores

        System.out.println(groupedByLength); // Output: {3=[Uno, Dos], 4=[Tres], 6=[Cuatro]}
    }
}
