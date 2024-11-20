package streams;

import java.util.List;

public class StreamVarExample {

    public static void main(String[] args) {

        // Declaracion de variables mediante 'var'
        var numbers = List.of(1, 2, 3, 4, 5);

        var doubleNumbers = numbers
                .stream()
                .map( n -> n * 2)
                .toList();

        System.out.println(doubleNumbers);
    }
}
