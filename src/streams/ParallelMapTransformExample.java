package streams;

import java.util.Map;
import java.util.stream.Collectors;

public class ParallelMapTransformExample {

    public static void main(String[] args) {

        // Transformar valores en paralelo
        // Usar parallelStream para transformar los valores de un mapa.
        Map<Integer, String> map = Map.of(
                1, "Uno",
                2, "Dos",
                3, "Tres",
                4, "Cuatro"
        );

        Map<Integer, String> transformedMap = map.entrySet().parallelStream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().toUpperCase() // Transformar valores a mayúsculas
                ));

        System.out.println(transformedMap); // Output: {1=UNO, 2=DOS, 3=TRES, 4=CUATRO}
    }
}
