package streams;

import java.util.List;

public class StreamLimitSkipExample {

    public static void main(String[] args) {

        //Limita el número de elementos o salta los primeros.
        List<Integer> numbers = List.of(1,2,3,4,5);

        List<Integer> limitedNumbers = numbers
                .stream()
                .limit(3)
                .toList();

        List<Integer> skypedNumbers = numbers
                .stream()
                .skip(2)
                .toList();

        System.out.println(limitedNumbers);
        System.out.println(skypedNumbers);
    }
}
