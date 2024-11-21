package streams;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ParallelStreamExample {

    public static void main(String[] args) {

        //Convierte un Stream secuencial en uno paralelo para aprovechar múltiples núcleos.
        final String  THREAD_NAME = " Hilo: ";
        final String NUMBER_OF_THREAD= "Número: ";
        final Integer NUMBER_FOR_DELETE = 3;

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        ForkJoinPool custonPool = new ForkJoinPool(3);
        custonPool.submit( () -> {
            numbers.stream()
                    .dropWhile( n -> (n < NUMBER_FOR_DELETE))
                    .parallel()
                    .forEach( n -> System.out.println(NUMBER_OF_THREAD + n + THREAD_NAME+ Thread.currentThread().getName()));

                }).join();
    }
}
