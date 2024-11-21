package practice01.interfaces;

public interface DefaultExample {

    default void start(String message) {
        System.out.println(message);
    }
}
