package mapas;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamMergeExample {

    public static void main(String[] args) {

        // Mezclar mapas con Streams
        // Combina dos mapas y elige cómo manejar conflictos.

        Map<Integer, String> map1 = Map.of(1, "Uno", 2, "Dos");
        Map<Integer, String> map2 = Map.of(2, "Two", 3, "Three");

        Map<Integer, String> mergedMap = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1 + " & " + v2 // Resolver conflictos
                ));

        System.out.println(mergedMap); // Output: {1=Uno, 2=Dos & Two, 3=Three}
    }
}
