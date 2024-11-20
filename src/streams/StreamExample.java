package streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {

        //Filtrar y mapear una lista
        List<String> names = Arrays.asList("Ana", "Juan", "Pedro", "Ana");

        List<String> uniqueNames = names
                .stream()
                .distinct()
                .filter( name -> name.length() > 3)
                .toList();

        System.out.println(uniqueNames);
    }
}
