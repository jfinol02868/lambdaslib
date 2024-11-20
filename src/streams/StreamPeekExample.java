package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekExample {

    public static void main(String[] args) {

        //Permite realizar acciones adicionales sobre los elementos sin consumirlos.
        List<String> names = List.of("Ana", "Juan", "Pedro");

        List<String> upperCaseNames = names.stream()
                .peek(name -> System.out.println("Procesando: " + name.concat("s")))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);
    }
}
