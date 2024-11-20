package lambdas;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jesus");
        map.putIfAbsent(2, "Maria");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
