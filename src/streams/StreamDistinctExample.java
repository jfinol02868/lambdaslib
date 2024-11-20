package streams;

import java.util.List;

public class StreamDistinctExample {

    public static void main(String[] args) {

        // Elimina duplicados del Stream.
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4);

        List<Integer> distinctNumbers = numbers
                .stream()
                .distinct()
                .toList();

        System.out.println(distinctNumbers);
    }
}
