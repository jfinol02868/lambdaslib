package streams;

import java.util.Map;

public class ParallelMapIterationExample {

    public static void main(String[] args) {

        // Iterar y procesar un mapa en paralelo
        // Utilizando parallelStream para procesar un mapa con múltiples hilos.
        Map<Integer, String> map = Map.of(
                1, "Uno",
                2, "Dos",
                3, "Tres",
                4, "Cuatro"
        );

        map.entrySet().parallelStream()
                .forEach(entry -> {
                    System.out.println("Clave: " + entry.getKey() +
                            ", Valor: " + entry.getValue() +
                            " - Hilo: " + Thread.currentThread().getName());
                });
    }
}
