package com.sc3.java_3sc3;

import java.util.ArrayList;
import java.util.List;

import static com.sc3.java_3sc3.Utils.printSeparator;

public class Lambdas {
    public static void main(String[] args) {
        Lambdas contact = new Lambdas(List.of("Kate", "John", "Bob", "Jessie", "Bill"));
        printSeparator();

        // 2 manières de println une liste
        contact.getNames().forEach(System.out::println);
        printSeparator();
        contact.getNames().forEach(name -> System.out.println(name));

        // ça marche comme ça aussi mais c'est moins usuel
        //List<String> welcomes = List.of(contact.getNames().stream().map(name -> "Welcome " + name + " !").toArray(String[]::new));
        List<String> welcomes = new ArrayList<>();
        printSeparator();

        contact.getNames().stream().map(name -> "Welcome " + name + " !").forEach(welcomes::add);
        welcomes.forEach(System.out::println);
    }

    private List<String> names;

    public Lambdas(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Lambdas{" +
                "names=" + names +
                '}';
    }
}
