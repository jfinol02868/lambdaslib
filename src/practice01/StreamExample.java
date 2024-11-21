package practice01;

import practice01.entity.Data;
import practice01.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StreamExample extends Data {

    public static void main(String[] args) {

        final Integer FILTER_NUMBER = 2;
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        numbers.stream()
                .filter(n -> !Objects.equals(n, FILTER_NUMBER))
                .forEach(System.out::println);

        List<Person> personas = Data.generateData(50);

        List<Person> personasFilter = personas
                .stream()
                .filter( p -> {
                    return Objects.equals(p.getName(), "Juan");
                })
                .toList();
        Integer totalPerson = personasFilter.size();

        personasFilter.forEach( p -> System.out.println(p.toString()));
        System.out.println(totalPerson);
    }
}
