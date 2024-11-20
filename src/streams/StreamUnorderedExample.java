package streams;

import java.util.List;

public class StreamUnorderedExample {
    public static void main(String[] args) {

        //Hace que el Stream no garantice un orden específico en los elementos
        // (útil para mejorar el rendimiento en operaciones paralelas).
        List<Integer> numbers = List.of(1,2,3,4,5);

        numbers.stream()
                .unordered()
                .parallel()
                .forEach(System.out::println);
    }
}
