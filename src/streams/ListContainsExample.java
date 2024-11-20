package streams;

import java.util.List;

public class ListContainsExample {

    public static void main(String[] args) {

        // verificar si la lista contiene un valor
        List<String> names = List.of("Ana", "Juan", "Pedro");

        boolean contain = names.contains("Pedro");
        System.out.println(contain);
    }
}
