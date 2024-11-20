package streams;

import java.util.Arrays;
import java.util.List;

public class StreamToArrayExample {

    public static void main(String[] args) {

        //No le vao mucho el caso de uso
        List<String> names = List.of("Ana", "Juan", "Pedro");

        String[] namesArray = names.toArray(String[]::new);

        System.out.println(Arrays.toString(namesArray));
    }
}
