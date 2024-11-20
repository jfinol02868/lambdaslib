package streams;

import java.util.List;

public class StreamCountExample {

    public static void main(String[] args) {

        //Cuenta los elementos de un stream
        List<Integer> numbers = List.of(1,2,3,4,5);

        long count = numbers
                .stream()
                .count();

        System.out.println(count);
    }
}
