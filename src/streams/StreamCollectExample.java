package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExample {

    public static void main(String[] args) {

        // Convierte el Stream en una colección o resultado específico
        List<String> names = List.of("Ana", "Juan", "Pedro");

        List<String> upperCase = names
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCase);
    }
}
