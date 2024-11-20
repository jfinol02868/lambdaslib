package streams;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {

        //Convierte un Stream secuencial en uno paralelo para aprovechar múltiples núcleos.
        IntStream.range(1, 10)
                .dropWhile( n -> n < 3)
                .parallel()
                .forEach( n -> System.out.println( "Numero " + n + " Hilo: "+ Thread.currentThread().getName()));
    }
}
