package streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelMapMergeExample {

    public static void main(String[] args) {

        // Fusionar mapas en paralelo
        // Usar Streams paralelos para combinar dos mapas.
        Map<Integer, String> map1 = Map.of(1, "Uno", 2, "Dos");
        Map<Integer, String> map2 = Map.of(2, "Two", 3, "Three");

        Map<Integer, String> mergedMap = Stream.concat(map1.entrySet().parallelStream(), map2.entrySet().parallelStream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1 + " & " + v2 // Resolver conflictos
                ));

        System.out.println(mergedMap); // Output: {1=Uno, 2=Dos & Two, 3=Three}
    }
}
