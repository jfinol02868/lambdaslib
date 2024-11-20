package mapas;

import java.util.Map;
import java.util.Optional;

public class MapFindExample {

    public static void main(String[] args) {

        // Encontrar una clave o valor específico
        // Usar Streams para buscar claves o valores que cumplan una condición.
        Map<Integer, String> map = Map.of(1, "Uno", 2, "Dos", 3, "Tres");

        // Buscar una clave específica
        Optional<Integer> key = map.keySet().stream().filter(k -> k > 2).findFirst();
        key.ifPresent(k -> System.out.println("Clave encontrada: " + k)); // Output: Clave encontrada: 3

        // Buscar un valor específico
        Optional<String> value = map.values().stream().filter(v -> v.startsWith("D")).findFirst();
        value.ifPresent(v -> System.out.println("Valor encontrado: " + v)); // Output: Valor encontrado: Dos
    }
}
