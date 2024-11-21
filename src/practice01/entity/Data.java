package practice01.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Person> generateData(int cantidad) {
        List<Person> personas = new ArrayList<>();
        Random random = new Random();

        String[] nombres = {
                "Juan", "Ana", "Carlos", "Laura", "Pedro", "Marta", "Luis", "Elena", "Raúl", "Sofia",
                "Marcos", "Paula", "David", "Clara", "Antonio", "Carmen", "Javier", "Patricia", "José", "Teresa",
                "Luis", "Isabel", "Alberto", "Celia", "Miguel", "Beatriz", "Ricardo", "Dolores", "José Luis", "Julia",
                "Francisco", "Verónica"
        };

        String[] apellidos = {
                "Pérez", "González", "Rodríguez", "López", "Martínez", "Sánchez", "Fernández", "Vázquez", "Ramírez", "Diaz",
                "García", "Hernández", "Jiménez", "Moreno", "Álvarez", "Ruiz", "Cruz", "Mendoza", "Torres", "Serrano",
                "Ramírez", "Vega", "Guerrero", "Castro", "Navarro", "Ortiz", "Ramos", "Díaz", "Blanco", "Silva",
                "Suárez", "Flores"
        };

        String[] ciudades = {"Madrid", "Barcelona", "Valencia", "Sevilla", "Zaragoza", "Málaga", "Murcia", "Bilbao", "Alicante", "Granada"};
        String[] paises = {"España", "México", "Argentina", "Colombia", "Chile", "Perú", "Venezuela", "Ecuador", "Uruguay", "Bolivia"};
        String[] calles = {"Calle Falsa", "Av. Libertad", "Calle Mayor", "Calle 10", "Calle 25", "Av. de la Constitución", "Calle de la Paz", "Calle del Sol"};

        for (int i = 0; i < cantidad; i++) {
            long id = (long) (random.nextInt(99999) + 1) ; // ID aleatorio
            String name = nombres[random.nextInt(nombres.length)];
            String lastName = apellidos[random.nextInt(apellidos.length)];
            String email = name.toLowerCase() + "." + lastName.toLowerCase() + "@example.com";
            String phone = "+34 600 123 " + (random.nextInt(1000) + 100); // Teléfono aleatorio
            String address = calles[random.nextInt(calles.length)] + " " + (random.nextInt(100) + 1); // Dirección aleatoria
            String city = ciudades[random.nextInt(ciudades.length)];
            String postalCode = String.format("%05d", random.nextInt(100000)); // Código postal aleatorio (5 dígitos)
            String country = paises[random.nextInt(paises.length)];
            personas.add(new Person(id, name, lastName, email, phone, address, city, postalCode, country));
        }
        return personas;
    }
}
