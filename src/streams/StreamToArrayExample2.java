package streams;

import java.util.List;

public class StreamToArrayExample2 {

    public static void main(String[] args) {

        //Convierte el Stream en un array.
        List<String> names = List.of("Ana", "Juan", "Pedro");

        String[] namesArray = names.stream().toArray(String[]::new);
        System.out.println(String.join(", ", namesArray)); // Output: Ana, Juan, Pedro
    }
}
