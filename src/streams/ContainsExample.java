package streams;

import java.util.List;
import java.util.Objects;

public class ContainsExample {

    public static void main(String[] args) {

        //Verificar si un elemento esta presente
        final String EVALUATE_NAME = "Pedro";

        List<String> names = List.of("Ana", "Juan", "Pedro", "Pedro");

        boolean containsPedro = names
                .stream()
                .anyMatch(name -> Objects.equals(name, EVALUATE_NAME));

        System.out.println(containsPedro);
    }
}
