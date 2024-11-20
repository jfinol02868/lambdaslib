package streams;

import java.util.List;

public class ContainsExample {

    public static void main(String[] args) {

        //Verificar si un elemento esta presente
        List<String> names = List.of("Ana", "Juan", "Pedro");

        boolean containsPedro = names
                .stream()
                .anyMatch(name -> name.equals("Pedro"));

        System.out.println(containsPedro);
    }
}
