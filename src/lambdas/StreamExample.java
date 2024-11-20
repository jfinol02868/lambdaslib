package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamExample {

    public static void main(String[] args) {

        //Todos los número distintos de dos '2'
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers
                .stream()
                .filter(n -> !Objects.equals(n , 2))
                .forEach(System.out::println);
    }
}
