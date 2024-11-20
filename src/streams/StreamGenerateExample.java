package streams;

import java.util.stream.Stream;

public class StreamGenerateExample {

    public static void main(String[] args) {

        //Genera un Stream infinito basado en un Supplier.
        Stream<String> stream = Stream.generate(() -> "Hola").limit(5);
        stream.forEach(System.out::println);
    }
}
