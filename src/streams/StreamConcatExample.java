package streams;

import java.util.stream.Stream;

public class StreamConcatExample {

    public static void main(String[] args) {

        // Combina dos Streams en uno solo.
        Stream<String> stream1 = Stream.of("A", "B");
        Stream<String> stream2 = Stream.of("C", "D");

        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);
        concatenatedStream.forEach(System.out::println);
    }
}
