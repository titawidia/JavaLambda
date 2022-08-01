package bagian8.application;

import bagian8.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//       SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Aera";
//            }
//        };

//        System.out.println(simpleAction1.action("Aera"));

//        SimpleAction simpleAction2 = (String name) -> {
//            return "Aera";
//        };

//        System.out.println(simpleAction2.action("Aera"));

        // Lambda dengan parameter
        SimpleAction simpleAction1 = (String value) -> { // dengan tipe data
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (name) -> { // tanpa tipe data
            return "Hello " + name;
        };

        // Lambda tanpa Block
        SimpleAction simpleAction3 = (String value) -> "Hello " + value;
        SimpleAction simpleAction4 = (value) -> "Hello " + value;
        SimpleAction simpleAction5 = value -> "Hello " + value;
    }
}
