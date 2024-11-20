package mapas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFromListExample {

    public static void main(String[] args) {

        // Crear un mapa a partir de una lista
        List<String> names = List.of("Ana", "Juan", "Pedro");

        Map<String, Integer> nameLengthMap = names.stream()
                .collect(Collectors.toMap(name -> name, String::length));

        System.out.println(nameLengthMap); // Output: {Ana=3, Juan=4, Pedro=5}
    }
}
