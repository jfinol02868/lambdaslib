package mapas;

import java.util.Map;

public class MapKeysValuesStreamExample {

    public static void main(String[] args) {

        // Obtener las claves o valores como Streams
        // Crear un Stream a partir de claves o valores de un mapa.
        Map<Integer, String> map = Map.of(1, "Uno", 2, "Dos", 3, "Tres");

        // Claves como Stream
        map.keySet().stream()
                .forEach(System.out::println); // Output: 1, 2, 3

        // Valores como Stream
        map.values().stream()
                .forEach(System.out::println); // Output: Uno, Dos, Tres
    }
}
