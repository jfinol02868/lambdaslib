package mapas;

import java.util.Map;

public class MapIterationExample {

    public static void main(String[] args) {

        //Usar forEach para recorrer un mapa.
        Map<Integer, String> map = Map.of(1, "Uno", 2, "Dos", 3, "Tres");

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
