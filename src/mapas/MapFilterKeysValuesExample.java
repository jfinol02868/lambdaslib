package mapas;

import java.util.Map;
import java.util.stream.Collectors;

public class MapFilterKeysValuesExample {

    public static void main(String[] args) {

        // Filtrar un mapa en base a claves o valores
        // Usar Streams para filtrar claves o valores específicos.
        Map<Integer, String> map = Map.of(1, "Uno", 2, "Dos", 3, "Tres");

        // Filtrar por clave
        Map<Integer, String> filteredByKey = map.entrySet().stream()
                .filter(entry -> entry.getKey() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Filtrar por valor
        Map<Integer, String> filteredByValue = map.entrySet().stream()
                .filter(entry -> entry.getValue().startsWith("D"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredByKey);   // Output: {2=Dos, 3=Tres}
        System.out.println(filteredByValue); // Output: {2=Dos}
    }
}
