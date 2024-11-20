package mapas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapGroupingExample {

    public static void main(String[] args) {

        //Usar Collectors.groupingBy para agrupar datos.
        List<String> names = List.of("Ana", "Juan", "Pedro", "Alma");

        Map<Character, List<String>> groupedByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupedByFirstLetter); // Output: {A=[Ana, Alma], J=[Juan], P=[Pedro]}
    }
}
