package org.example.Task1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ComplexExamples {
 /*
        Task1
            Убрать дубликаты, отсортировать по идентификатору, сгруппировать по имени

         */

    static class Person {
        final int id;

        final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return getId() == person.getId() && getName().equals(person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }
    }

    private static Person[] RAW_DATA = new Person[]{

            new Person(0, "Harry"),
            new Person(0, "Harry"), // дубликат
            new Person(1, "Harry"), // тёзка
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),

    };


    public static void main(String[] args) {
        System.out.println("Raw data:");
        System.out.println();

        for (Person person : RAW_DATA) {
            System.out.println(person.id + " - " + person.name);
        }
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
        if(RAW_DATA == null) {
            new RuntimeException("Array is null! Please try again!");
        }



        Arrays.stream(RAW_DATA)
                .filter(Objects::nonNull)
                .filter(obj -> obj.getName() != null)
                .distinct()
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .collect(Collectors.groupingBy(Person::getName, LinkedHashMap::new, Collectors.counting()))
                .forEach((a, b) -> System.out.printf("Key: %s\nValue:%d\n", a, b));

        System.out.println();


    }

}
