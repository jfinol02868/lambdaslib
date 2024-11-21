package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LargeDataMapExample {

    public static void main(String[] args) {
        Map<Integer, String> largeMap = new HashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            largeMap.put(i, "Valor" + i);
        }

        // Procesar en paralelo
        Map<Integer, String> filteredMap = largeMap.entrySet().parallelStream()
                .filter(entry -> entry.getKey() % 2 == 0) // Filtrar claves pares
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredMap.size()); // Ejemplo: Filtrado de 500,000 elementos
    }
}
