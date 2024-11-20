package mapas;

import java.util.HashMap;
import java.util.Map;

public class MapReplaceExample {

    public static void main(String[] args) {

        // Actualizar valores con replace y replaceAll
        // Permiten reemplazar valores existentes.
        Map<Integer, String> map = new HashMap<>(Map.of(1, "Uno", 2, "Dos", 3, "Tres"));

        // Reemplazar un valor específico
        map.replace(2, "Two");

        // Reemplazar todos los valores
        map.replaceAll((key, value) -> value.toUpperCase());

        System.out.println(map); // Output: {1=UNO, 2=TWO, 3=TRES}
    }
}
