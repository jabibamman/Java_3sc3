package com.sc3.java_3sc3;

import java.util.List;

import static com.sc3.java_3sc3.Utils.printSeparator;
import static java.io.File.separator;

public class Streams {
    public static void main(String[] args) {
        printSeparator();

        Streams streams = new Streams(List.of("0", "1", "2", "2", "3", "4", "4", "5", "6", "7", "8", "9", "10", "11", "11", "12", "13", "19"));

        // Garder les trois premier nombres impair
        streams.getNumbers().stream().filter(n -> !streams.isPair(n)).limit(3).forEach(System.out::println);
        // add to separator "___" with stream
        printSeparator();

        // Pour sauter le premier élement impair
        streams.getNumbers().stream().filter(n -> !streams.isPair(n)).skip(1).forEach(System.out::println);

        List<String> numbers;

        numbers = streams.getNumbers().stream().filter(n -> !streams.isPair(n)).skip(1).toList();

        printSeparator();
        System.out.println(numbers);
    }

    List <String> numbers;

    public Streams(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public boolean isPair(String number) {
        return Integer.parseInt(number) % 2 == 0;
    }
}
