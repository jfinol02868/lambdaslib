package streams;

import java.util.List;
import java.util.Optional;

public class StreamFindExample {

    public static void main(String[] args) {

        //Encuentran el primer o cualquier elemento del Stream.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Optional<Integer> first = numbers.stream().findFirst();
        Optional<Integer> any = numbers.stream().findAny();

        first.ifPresent(System.out::println);
        any.ifPresent(System.out::println);
    }
}
