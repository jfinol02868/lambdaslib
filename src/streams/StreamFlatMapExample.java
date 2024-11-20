package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static void main(String[] args) {

        // Convierte cada elemento de un Stream en un nuevo Stream y los concatena en un único Stream.
        List<List<String>> nameList = List.of(
                List.of("Juan", "Pedro"),
                List.of("Ana", "Lucia"),
                List.of("Carlos")
        );

        List<String> allNames = nameList
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(allNames);
    }
}
