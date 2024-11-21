package streams;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {

    public static void main(String[] args) {

        // Para eliminar elementos en una colección, se utiliza el método removeIf.
        final String CHARACTER = "J";

        List<String> names = new ArrayList<>(List.of("Ana", "Juan", "Pedro", "Lucía"));
        names.removeIf( n -> n.startsWith(CHARACTER));
        System.out.println(names);
    }
}
