package streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {

        //Filtrar y mapear una lista
        final int LENGTH_MANE = 3;
        List<String> names = Arrays.asList("Ana", "Juan", "Pedro", "Ana");

        List<String> uniqueNames = names
                .stream()
                .distinct()
                .filter( name -> name.length() > LENGTH_MANE)
                .toList();

        System.out.println(uniqueNames);
    }
}
