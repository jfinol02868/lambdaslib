package mapas;


import java.util.HashMap;
import java.util.Map;

public class MapComputeIfExample {

    // Mapear valores con computeIfAbsent y computeIfPresent
    // Añade o actualiza valores según condiciones.
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Agregar un valor si no existe
        map.computeIfAbsent("Java", key -> 1);

        // Modificar un valor si existe
        map.computeIfPresent("Java", (key, value) -> value + 1);

        System.out.println(map); // Output: {Java=2}
    }
}
