package streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamTakeWhileExample {

    public static void main(String[] args) {

        // Tomar de la lista mientras se cumpla la condifion
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6)
                .takeWhile( n -> n < 4)
                .toList();
        System.out.println(numbers);

    }
}
