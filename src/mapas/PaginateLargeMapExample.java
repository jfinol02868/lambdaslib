package mapas;

import entity.ConfigApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PaginateLargeMapExample {

    public static void main(String[] args) {

        long inicio1 = System.nanoTime();
        Map<String, ConfigApp> configMap = new HashMap<>();
        for(int i = 0; i < 1_000_000; i++) {
            configMap.put(UUID.randomUUID().toString(), new ConfigApp(
                    UUID.randomUUID().toString(),
                    generarNombreAleatorio(8),
                    generarNombreAleatorio(100),
                    20.0,
                    new Random().nextInt()
            ));
        }

        long fin1 = System.nanoTime();
        long duracion1 = fin1 - inicio1;
        double duracionEnSegundos1 = duracion1 / 1_000_000_000.0;
        System.out.println("La generacion de datos duró: " + duracionEnSegundos1 + " segundos.");

        // Crear un mapa grande con 100,000,000 de registros
        Map<String, ConfigApp> largeMap = configMap;

        // Tamaño de página (ejemplo: 1,000,000 registros por página)
        int pageSize = 1_000_000;

        // Total de páginas
        int totalPages = (int) Math.ceil((double) largeMap.size() / pageSize);

        long inicio = System.nanoTime();

        // Procesar las páginas en paralelo
        IntStream.range(0, totalPages).parallel().forEach(page -> {
            // Calcular límites de la página
            int start = page * pageSize;
            int end = Math.min(start + pageSize, largeMap.size());

            // Extraer submapa (página actual)
            Map<String, ConfigApp> currentPage = largeMap.entrySet().stream()
                    .skip(start)
                    .limit(pageSize)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            // Procesar los datos de la página

            processPage(currentPage, page);
        });
        long fin = System.nanoTime();
        long duracion = fin - inicio;
        double duracionEnSegundos = duracion / 1_000_000_000.0;
        System.out.println("La operación duró: " + duracionEnSegundos + " segundos.");
    }

    // Método para procesar una página específica
    public static void processPage(Map<String, ConfigApp> page, int pageIndex) {
        System.out.println("Procesando página " + pageIndex + " con " + page.size() + " registros.");
        // Simular procesamiento (puedes agregar lógica aquí)
        page.forEach((key, value) -> {
            System.out.println("KEY::::"+ key);
            System.out.println("VALUE::::"+ value.toString());
        });
    }

    public static String generarNombreAleatorio(int longitud) {
        // Definir los caracteres posibles (letras mayúsculas y minúsculas)
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        StringBuilder nombre = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            nombre.append(caracteres.charAt(indice));
        }

        return nombre.toString();
    }
}
