package org.example;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 7};
        int sum = 10;


        IntStream.range(0, array.length)
                .forEach(i -> IntStream.range(0, array.length)
                        .filter(Objects::nonNull)
                        .filter(j -> i != j && array[i] + array[j] == sum)
                        .distinct()
                        .forEach(j -> System.out.println("Pair { " + array[i]  +"," + array[j] + "}  is  consist - " + sum)));
    }
}
















