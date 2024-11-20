package lambdas;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> name = Optional.of("Jesus");
        name.ifPresent(System.out::println);

        Optional<String> empty = Optional.empty();
        System.out.println(empty.orElse("Nombre no encontrado"));
    }
}
