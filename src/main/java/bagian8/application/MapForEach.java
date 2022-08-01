package bagian8.application;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEach {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Aera");
        map.put("middle_name", "Hye");
        map.put("last_name", "Ren");

        // for loop
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // forEach anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });

        // lambda
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
