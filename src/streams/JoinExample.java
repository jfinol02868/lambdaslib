package streams;

import java.util.List;
import java.util.stream.Collectors;

public class JoinExample {

    public static void main(String[] args) {

        // Unir elementos
        List<String> names = List.of("Ana", "Juan", "Pedro");

        String result = String.join(", ", names);
        System.out.println(result);

        String result2 = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result2);
    }
}
