package practice01;

import practice01.interfaces.DefaultExample;

public class DefaultMethod implements DefaultExample {

    public static void main(String[] args) {
        new DefaultMethod().start("Ahora el mensaje viene desde la misma clase");
    }
}
