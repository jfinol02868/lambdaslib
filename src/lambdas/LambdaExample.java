package lambdas;

import lambdas.interfacelist.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExample {

    public static void main(String[] args) {

        System.out.println("-------Example 1------");
        List<String> names = Arrays.asList("Pedro", "Juan", "Maria");
        names.forEach( name -> System.out.println("Hola " + name));
        System.out.println();

        System.out.println("-------Example 2------");
        //Lambda sin parámetros
        Greet greet = () -> System.out.println("Hola mundo");
        greet.sayHello();
        System.out.println();

        // Se puede implementar lo que quieras que no devuelva nada
        Greet otherGreet = () -> System.out.println("El resultado es: "+ 2 + 2);
        otherGreet.sayHello();


        System.out.println("-------Example 3------");
        //En esta caso se sustituye () -> por el parametro "message"
        Printer printer = message -> System.out.println("Imprimiendo: " + message);
        printer.print("Hola, lambda!");
        System.out.println();

        System.out.println("-------Example 4------");
        MathOperation mathOperation = (a, b) -> (a + b);
        System.out.println("La suma de a + b es: "+ mathOperation.operation(3, 6));
        System.out.println("La suma de a + b es: "+ mathOperation.operation(5, 20));

        // Incorporando un body al lambdas
        System.out.println();
        MathOperation multiply = (x, y) -> {
            System.out.println("El resultado de: " + x +" X "+y+ " es:");
            return  (x * y);
        };
        System.out.println("Resultado: " + multiply.operation(2, 8));
        System.out.println();

        System.out.println("-------Example 5------");
        // Lambas que devuelven un valor
        StringFormatter stringFormatter = message -> message.toUpperCase();
        String formaterResult = stringFormatter.format("Hello world...");
        System.out.println("Formater Result: " + formaterResult);
        System.out.println();


        System.out.println("-------Example 6------");
        //Lamdas con metodos predefinidos
        Consumer<String> greeter = name -> System.out.println("Name: " + name);
        greeter.accept("Juan");
        greeter.accept("Jose");
        greeter.accept("Maria");
        System.out.println();

        //Supplier (no recibe nada y devuelve un valor):
        Supplier<String> supplier = () -> "Hello world since supplier";
        System.out.println("Desde supplier: " + supplier.get());
        System.out.println();

        // Predicate (recibe un valor y devuelve un booleano):
        Predicate<Integer> isEvent = number -> (number % 2) == 0;
        System.out.println("Desde predicate: " +isEvent.test(8));
        System.out.println();

        // Function (recibe un valor y devuelve otro)
        Function<String, Integer> lengthCalculator = str -> str.length();
        System.out.println("La longitud de la palabra 'HOLA' es:  "+ lengthCalculator.apply("Hola"));

        System.out.println("-------Example 7------");
        // Lambda con tipos explícitos
        Adder adder = (Integer a, Integer b) -> (a + b);
        System.out.println("El resultado es: " + adder.add(5, 8));
        System.out.println();

        System.out.println("-------Example 8------");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Suma de cuadrados de pares: "+ sum);
        System.out.println();
    }
}
