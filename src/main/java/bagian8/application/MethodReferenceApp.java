package bagian8.application;

import bagian8.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // Method Reference Static

        // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("aera"));
        System.out.println(predicateIsLowerCase.test("Aera"));

        // Method Reference di Parameter

        // Function<String, String> functionUpper = (String value) -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Aera"));
    }

    // Method Reference Non-Static
    public void run() {
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("aera"));
        System.out.println(predicateIsLowerCase.test("Aera"));
    }

    // Method Reference Object
    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("aera"));
        System.out.println(predicateIsLowerCase.test("Aera"));
    }
    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }

        return true;
    }
}
