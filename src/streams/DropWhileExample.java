package streams;

import java.util.List;
import java.util.stream.Collectors;

public class DropWhileExample {

    public static void main(String[] args) {

        //Elimina elementos mientras se cumpla una condición.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers
                .stream()
                .dropWhile(n -> n < 4)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
