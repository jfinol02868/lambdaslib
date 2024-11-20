package lambdas.interfacelist;

public interface Vehicle {

    default void start() {
        System.out.println("El carro a iniciado.");
    }
}
