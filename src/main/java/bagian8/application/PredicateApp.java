package bagian8.application;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        // Interface Predicate
        Predicate<String> predicateCheckBlank = value -> value.isBlank();

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Aera"));
    }
}
