package streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelForEachOrderedExample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,34,23,1,22,17,13,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35));

        // Garantiza el orden en Streams paralelos.
        numbers.stream()
                .parallel()
                .forEachOrdered(System.out::println);

       /* IntStream.range(1, 10)
                .parallel()
                .forEachOrdered(System.out::println); // Output: 1, 2, 3, ..., 9*/
    }
}
