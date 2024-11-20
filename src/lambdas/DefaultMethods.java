package lambdas;

import lambdas.interfacelist.Vehicle;

public class DefaultMethods implements Vehicle {

    public static void main(String[] args) {
        // Al no ser un metodo dinamico se tiene que referenciar mediante la case
        new DefaultMethods().start();
    }
}
