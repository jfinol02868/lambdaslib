package streams;

import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {

        // Reduce los elementos a un unico valor
        List<Integer> numbers = List.of(1,2,3,4,5);

        Integer suma = numbers
                .stream()
                .reduce(0, Integer::sum);

        System.out.println(suma);
    }
}
