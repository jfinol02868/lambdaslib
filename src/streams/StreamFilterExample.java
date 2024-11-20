package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static void main(String[] args) {

        // Operaciones intermedias
        List<Integer> numbers = List.of(1,2,3,4,5);

        List<Integer> eventNumber = numbers
                .stream()
                .filter( n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(eventNumber);
    }
}
