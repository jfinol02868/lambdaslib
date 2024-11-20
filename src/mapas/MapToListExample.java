package mapas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListExample {

    public static void main(String[] args) {

        // Convertir un mapa a otra estructura
        // Por ejemplo, convertir un mapa en una lista.
        Map<Integer, String> map = Map.of(1, "Uno", 2, "Dos", 3, "Tres");

        // Convertir a una lista de cadenas
        List<String> list = map.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.toList());

        System.out.println(list); // Output: [1: Uno, 2: Dos, 3: Tres]
    }
}
