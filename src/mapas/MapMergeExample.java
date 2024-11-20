package mapas;

import java.util.HashMap;
import java.util.Map;

public class MapMergeExample {

    public static void main(String[] args) {

        // Fusionar mapas
        // Usar merge para combinar valores en un mapa.
        Map<Integer, String> map1 = new HashMap<>(Map.of(1, "Uno", 2, "Dos"));
        Map<Integer, String> map2 = Map.of(2, "Two", 3, "Three");

        map2.forEach((key, value) ->
                map1.merge(key, value, (v1, v2) -> v1 + " & " + v2)
        );

        System.out.println(map1); // Output: {1=Uno, 2=Dos & Two, 3=Three}
    }
}
