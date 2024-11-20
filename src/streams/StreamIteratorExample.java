package streams;

import java.util.stream.Stream;

public class StreamIteratorExample {

    public static void main(String[] args) {

        //Crea un Stream infinito basado en un iterador.
        Stream<Integer> infinityStream = Stream.iterate(1, n -> n +1).limit(20);
        infinityStream.forEach(System.out::println);
    }
}
