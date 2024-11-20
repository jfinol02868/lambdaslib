package streams;

import java.util.Collections;
import java.util.List;

public class ReverseExample {

    public static void main(String[] args) {

        //Inversión de orden
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> reversed = numbers
                .stream()
                .sorted(Collections.reverseOrder())
                .toList();

        System.out.println(reversed);
    }
}
