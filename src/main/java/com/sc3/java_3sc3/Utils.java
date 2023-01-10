package com.sc3.java_3sc3;

import java.util.List;

public class Utils {
    private static final List<String> separator = List.of("____");

    public static void printSeparator() {
        separator.forEach(System.out::println);
    }

    public List<String> getSeparator() {
        return separator;
    }
}
