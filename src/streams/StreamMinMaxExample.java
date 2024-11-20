package streams;

import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static void main(String[] args) {

        // Obtiene el minimo y el maximo de una lista
        List<Integer> numbes  = List.of(1,2,3,4,5);

        Optional<Integer> min = numbes
                .stream()
                .min(Integer::compareTo);

        Optional<Integer> max = numbes
                .stream().max(Integer::compareTo);

        min.ifPresent(System.out::println);
        max.ifPresent(System.out::println);
    }
}
