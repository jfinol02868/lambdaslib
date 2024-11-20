package mapas;

import java.util.HashMap;
import java.util.Map;

public class MapComputeExample {

    public static void main(String[] args) {

        // Manipular valores de un mapa
        // Usar compute, computeIfPresent y computeIfAbsent.
        Map<Integer, String> map = new HashMap<>(Map.of(1, "Uno", 2, "Dos"));

        // Actualizar un valor existente
        map.compute(1, (key, value) -> value + " actualizado");

        // Agregar un valor si no existe
        map.computeIfAbsent(3, key -> "Tres");

        // Modificar un valor si existe
        map.computeIfPresent(2, (key, value) -> value.toUpperCase());

        System.out.println(map); // Output: {1=Uno actualizado, 2=DOS, 3=Tres}
    }
}
