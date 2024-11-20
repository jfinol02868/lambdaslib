package streams;

import java.util.Map;

public class ParallelMapReduceExample {

    public static void main(String[] args) {

        // Calcular sumas de claves o valores en paralelo
        // Usar reduce para calcular una suma o combinación de claves/valores.
        Map<Integer, String> map = Map.of(
                1, "Uno",
                2, "Dos",
                3, "Tres",
                4, "Cuatro"
        );

        int sumOfKeys = map.keySet().parallelStream()
                .reduce(0, Integer::sum); // Suma de claves

        System.out.println("Suma de claves: " + sumOfKeys); // Output: 10
    }
}
