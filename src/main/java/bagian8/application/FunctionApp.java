package bagian8.application;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        // Interface Function
        Function<String, Integer> functionLength = value -> value.length();

        System.out.println(functionLength.apply("Aera"));
    }
}
