package streams;

import java.util.List;

public class ListContainsExample {

    public static void main(String[] args) {

        //Verificar si un elemento esta presente en una lista
        final String EVALUATE_NAME = "Pedro";

        List<String> names = List.of("Ana", "Juan", "Pedro");

        boolean contain = names.contains(EVALUATE_NAME);
        System.out.println(contain);
    }
}
