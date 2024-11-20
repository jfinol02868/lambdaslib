package mapas;

import java.util.HashMap;
import java.util.Map;

public class MapMergeExample2 {

    public static void main(String[] args) {

        // Combinar valores con merge
        // Funde valores existentes o agrega nuevos.
        Map<String, Integer> map = new HashMap<>(Map.of("A", 1, "B", 2));

        // Fusionar claves existentes
        map.merge("A", 5, Integer::sum); // Suma 5 al valor existente
        map.merge("C", 3, Integer::sum); // Agrega una nueva clave "C"

        System.out.println(map); // Output: {A=6, B=2, C=3}
    }
}
