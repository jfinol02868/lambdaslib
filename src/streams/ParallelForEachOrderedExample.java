package streams;

import java.util.stream.IntStream;

public class ParallelForEachOrderedExample {

    public static void main(String[] args) {

        // Garantiza el orden en Streams paralelos.
        IntStream.range(1, 10)
                .parallel()
                .forEachOrdered(System.out::println); // Output: 1, 2, 3, ..., 9
    }
}
