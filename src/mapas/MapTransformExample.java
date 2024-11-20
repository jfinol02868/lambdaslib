package mapas;

import java.util.Map;
import java.util.stream.Collectors;

public class MapTransformExample {

    public static void main(String[] args) {

        //Usar map para transformar claves o valores.
        Map<Integer, String> map = Map.of(1, "Uno", 2, "Dos", 3, "Tres");

        Map<Integer, String> transformedMap = map.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().toUpperCase() // Transformar valores a mayúsculas
                ));

        System.out.println(transformedMap); // Output: {1=UNO, 2=DOS, 3=TRES}
    }
}
