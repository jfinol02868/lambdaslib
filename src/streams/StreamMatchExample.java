package streams;

import java.util.List;

public class StreamMatchExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);

        System.out.println("¿Algún número par? " + anyEven); // Output: true
        System.out.println("¿Todos son positivos? " + allPositive); // Output: true
        System.out.println("¿Ningún número negativo? " + noneNegative); // Output: true
    }
}
