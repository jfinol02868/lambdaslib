package mapas;

import java.util.Map;
import java.util.stream.Collectors;

public class MapFilterExample {

    public static void main(String[] args) {

        // Usar filter para seleccionar elementos según una condición.
        Map<Integer, String> map = Map.of(1, "Uno", 2, "Dos", 3, "Tres");

        Map<Integer, String> filteredMap = map.entrySet().stream()
                .filter(entry -> entry.getKey() > 1) // Filtrar claves mayores que 1
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredMap); // Output: {2=Dos, 3=Tres}
    }

}
